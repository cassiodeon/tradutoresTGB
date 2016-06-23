import java.util.*;

public class contador {
	public static int contador;

	public static void main(String[] args){
		contador = 0;
		while(contador < 10){
			System.out.println(contador + "\t");
			contador = contador + 1;
		}

	}
}
