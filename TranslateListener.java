import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

public class TranslateListener extends GrammarPortugolBaseListener {
    GrammarPortugolParser parser;
    public TranslateListener(GrammarPortugolParser parser) {this.parser = parser;}
    
    /** Listen to matches of enterDeclaracao_algoritmo and exitDeclaracao_algoritmo */
    @Override
    public void enterDeclaracao_algoritmo(GrammarPortugolParser.Declaracao_algoritmoContext ctx) {
        System.out.println("public class " + ctx.T_IDENTIFICADOR() + " {");
    }

    @Override
    public void exitAlgoritmo(GrammarPortugolParser.AlgoritmoContext ctx) {
        System.out.println("}");
    }

    /** Listen to matches of enterStm_block and exitStm_block */
    /** Aqui será transformado no método main de classe **/
    @Override
    public void enterStm_block(GrammarPortugolParser.Stm_blockContext ctx) {
        System.out.print("\t");
        System.out.println("public static void main(String[] args){");
    }

    @Override
    public void exitStm_block(GrammarPortugolParser.Stm_blockContext ctx) {
        System.out.print("\t");
        System.out.println("}");
    }
}