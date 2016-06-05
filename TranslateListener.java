import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

import java.util.ArrayList;

public class TranslateListener extends GrammarPortugolBaseListener {
    GrammarPortugolParser parser;
    ArrayList<String> listAttributes;
    String finalLine = ";";
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

    /** Listen to matches of enterVar_decl_block and exitVar_decl_block */
    /** Serão traduzidos para atributos da classe */
    @Override public void enterVar_decl_block(GrammarPortugolParser.Var_decl_blockContext ctx) {
        listAttributes = new ArrayList();
    }

    @Override public void enterVar_decl(GrammarPortugolParser.Var_declContext ctx) {
        //Percorre cada variável declarada
        for (TerminalNode terminal : ctx.T_IDENTIFICADOR()) {
            String identifier = terminal.toString();
            String typeData = "";

            //Verifica se foi de um tipo primitivo
            if(ctx.tp_primitivo() != null){
                //Obtem o tipo correspondente em Java
                int typeToken = ctx.tp_primitivo().getStart().getType();
                typeData = getTypeData(typeToken);

                System.out.print("\t");
                //Monta a delcaração correspondente em Java
                System.out.println(typeData +" "+ identifier + finalLine);

            //Verifica se foi do tipo matriz
            }else if(ctx.tp_matriz() != null){
                //Obtem os tamanhos declarados para a matriz|array
                ArrayList<String> size = new ArrayList<String>();
                for (TerminalNode sizeMatriz : ctx.tp_matriz().T_INT_LIT()) {
                    size.add(sizeMatriz.getText());
                }

                //(Pré)Monta o inicio da declaração e o final da declaração da matriz|array
                String declMatrix = "";
                String declMatrixSize = "";
                for(int i = 0; i < size.size(); i++){
                    declMatrix += "[]";
                    declMatrixSize += "["+size.get(i)+"]";
                }

                //Obtem o tipo correspondente em Java
                int typeToken = ctx.tp_matriz().tp_prim_pl().getStart().getType();
                typeData = getTypeData(typeToken);

                //Monta a delcaração correspondente em Java
                System.out.print("\t");
                System.out.println(typeData + " "+ identifier + declMatrix + " = new "+ typeData + declMatrixSize + finalLine);
            }

        }
    }

    /** Listen to matches of enterStm_block and exitStm_block */
    /** Aqui será transformado no método main de classe **/
    @Override
    public void enterStm_block(GrammarPortugolParser.Stm_blockContext ctx) {
        System.out.print("\t");
        System.out.println("public static void main(String[] args){");
    }

    @Override public void enterStm_se(GrammarPortugolParser.Stm_seContext ctx) {
        System.out.print("\t\t");
        System.out.print("if(");
        System.out.print(this.convertExprConditional(ctx.expr().getText()));
        System.out.println("){");
    }

    @Override public void exitStm_se(GrammarPortugolParser.Stm_seContext ctx) {
        System.out.print("\t\t");
        System.out.println("}");
    }

    @Override
    public void exitStm_block(GrammarPortugolParser.Stm_blockContext ctx) {
        System.out.print("\t");
        System.out.println("}");
    }

    private String getTypeData(int typeToken){
        String type = "";
        if(typeToken == parser.INTEIRO || typeToken == parser.INTEIROS){
            type = "int";
        }else if(typeToken == parser.REAL || typeToken == parser.REAIS){
            type = "float";
        }else if(typeToken == parser.CARACTERE || typeToken == parser.CARACTERES){
            type = "char";
        }else if(typeToken == parser.LITERAL || typeToken == parser.LITERAIS){
            type = "String";
        }else if(typeToken == parser.LOGICO || typeToken == parser.LOGICOS){
            type = "boolean";
        }

        return type;
    }

    private String convertExprConditional(String expr){
//    	String[] strPortugol = new String[]{"=", " e ", " ou ", " não "};
//    	String[] strJava =  new String[]{, " && ", " || ", " ! "};
    	   	
    	
    	expr = expr.replaceAll("=", "==");
    	expr = expr.replaceAll("e", " && ");
    	expr = expr.replaceAll("ou", " || ");
    	expr = expr.replaceAll("não", " ! ");
    	expr = expr.replaceAll("<>", " != ");
    	
    	return expr;
//    	StringUtils.replaceEach(expr, strPortugol, strJava);
//        String exprReturn = "";
        // De = para ==
        // De e para &&
        // De ou para ||
        // De não para !
//        return expr;
    }
}