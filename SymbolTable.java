import java.util.*;

public class SymbolTable{
	private Hashtable<String, Integer> table;
	protected SymbolTable prev;

	public SymbolTable(SymbolTable prev){
		this.table = new Hashtable<String,Integer>();
		this.prev = prev;
	}

	public void put(String id, int type){
		this.table.put(id,type);
	}

	public Integer get(String id){
		for (SymbolTable t = this; t != null; t = t.prev) {
			Integer found = (Integer)(t.table.get(id));
			if(found != null){
				return found;
			}
		}

		return null;
	}

	public SymbolTable getPrev(){
		return this.prev;
	}
}