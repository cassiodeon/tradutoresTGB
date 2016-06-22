import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class TranslateListener extends GrammarPortugolBaseListener {
    GrammarPortugolParser parser;
    ArrayList<String> listAttributes;
    String finalLine = ";";
    int nivelAninhamento = 0;
    int countLeia = 0;
    SymbolTable symbolTable;

    public TranslateListener(GrammarPortugolParser parser) {this.parser = parser;}

    /** Listen to matches of enterDeclaracao_algoritmo and exitDeclaracao_algoritmo */
    @Override
    public void enterDeclaracao_algoritmo(GrammarPortugolParser.Declaracao_algoritmoContext ctx) {
        System.out.println("import java.util.*;\n");
        System.out.println("public class " + ctx.T_IDENTIFICADOR() + " {");
        symbolTable = new SymbolTable(null);
        nivelAninhamento++;
    }

    @Override
    public void exitAlgoritmo(GrammarPortugolParser.AlgoritmoContext ctx) {
        System.out.println("}");
    }

    /** Listen to matches of enterVar_decl_block and exitVar_decl_block */
    /** Serão traduzidos para atributos da classe */
    @Override
    public void enterVar_decl_block(GrammarPortugolParser.Var_decl_blockContext ctx) {
        listAttributes = new ArrayList();
    }

    @Override
    public void enterVar_decl(GrammarPortugolParser.Var_declContext ctx) {
        String modifierProp = "public static ";
        //Percorre cada variável declarada
        for (TerminalNode terminal : ctx.T_IDENTIFICADOR()) {
            String identifier = terminal.toString();
            String typeData = "";

            //Verifica se foi de um tipo primitivo
            if(ctx.tp_primitivo() != null){
                //Obtem o tipo correspondente em Java
                int typeToken = ctx.tp_primitivo().getStart().getType();
                typeData = getTypeData(typeToken);
                symbolTable.put(identifier,typeToken);

                this.printTabs();
                //Monta a delcaração correspondente em Java
                System.out.println(modifierProp + typeData +" "+ identifier + finalLine);

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
                this.printTabs();
                symbolTable.put(identifier,typeToken);
                System.out.println(modifierProp + typeData + " "+ identifier + declMatrix + " = new "+ typeData + declMatrixSize + finalLine);
            }
        }
    }

    /** Listen to matches of enterStm_block and exitStm_block */
    /** Aqui será transformado no método main de classe **/
    @Override
    public void enterStm_block(GrammarPortugolParser.Stm_blockContext ctx) {
        System.out.print("\n");
        this.printTabs();
        System.out.println("public static void main(String[] args){");
        nivelAninhamento++;
    }

    /**Converte estrutras de controle**/
    /** CONVERTE ESTRUTURA CONDICIONAL "SE" **/
    @Override
    public void enterStm_se(GrammarPortugolParser.Stm_seContext ctx) {
        this.printTabs();

        System.out.print("if(");
        System.out.print(this.convertExprConditional(ctx.expr()));
        System.out.println("){");

        nivelAninhamento++;
    }

    @Override
    public void exitStm_se(GrammarPortugolParser.Stm_seContext ctx) {
        nivelAninhamento--;
        this.printTabs();
        System.out.println("}");
        System.out.print("\n");
    }

    @Override
    public void enterStm_senao(GrammarPortugolParser.Stm_senaoContext ctx) {
        nivelAninhamento--;
        this.printTabs();
        System.out.println("}else{");
        nivelAninhamento++;
    }
    /** FIM SE **/

    /** CONVERTE ESTRUTURA REPETICAO "ENQUANTO" **/
    @Override
    public void enterStm_enquanto(GrammarPortugolParser.Stm_enquantoContext ctx) {
        this.printTabs();

        System.out.print("while(");
        System.out.print(this.convertExprConditional(ctx.expr()));
        System.out.println("){");
        nivelAninhamento++;
    }

    @Override
    public void exitStm_enquanto(GrammarPortugolParser.Stm_enquantoContext ctx) {
        nivelAninhamento--;
        this.printTabs();
        System.out.println("}");
        System.out.print("\n");
    }
    /** FIM ENQUANTO **/

    /** CONVERTE ESTRUTURA REPETICAO "PARA" **/
    @Override
    public void enterStm_para(GrammarPortugolParser.Stm_paraContext ctx) {
        String delcaracaoFor = "";
        String condicaoFor = "";
        String variavelControleFor = "";
        String passo = "";
        String operadorCondicao = "<";
        String fatorDeMudanca = "";

        this.printTabs();

        System.out.print("for(");
        if(ctx.expr().size() == 2){
            variavelControleFor = ctx.lvalue().getText();
            fatorDeMudanca = variavelControleFor+"++";
            delcaracaoFor = variavelControleFor + "=" + this.convertExprConditional(ctx.expr(0)) + "; ";

            if(ctx.passo() != null){
                passo = ctx.passo().getText();
                String aux = passo.replace("passo","");
                String incrementoMudanca = "+";
                int numPasso = Integer.parseInt(aux);
                if(numPasso < 0){
                    operadorCondicao = ">";
                    incrementoMudanca = "";
                }

                fatorDeMudanca = variavelControleFor + "=" + variavelControleFor + incrementoMudanca + numPasso;
            }
            condicaoFor = variavelControleFor + operadorCondicao + this.convertExprConditional(ctx.expr(1)) + "; ";
        }
        System.out.print(delcaracaoFor + condicaoFor + fatorDeMudanca);
        System.out.println("){");
        nivelAninhamento++;
    }

    @Override
    public void exitStm_para(GrammarPortugolParser.Stm_paraContext ctx) {
        nivelAninhamento--;
        this.printTabs();
        System.out.println("}");
        System.out.print("\n");
    }
    /** FIM PARA **/
    /**fim estruções de controle */

    //CONVERTE ATRIBUIÇÃO
    @Override
    public void enterStm_attr(GrammarPortugolParser.Stm_attrContext ctx) {
        String identificador = ctx.lvalue().getText();
        convertExprAssignment(ctx.expr(),identificador);
    }

    //CONVERTE CHAMADA DE FUNÇÃO
    @Override
    public void enterFcall(GrammarPortugolParser.FcallContext ctx) {
        if(ctx.T_IDENTIFICADOR().getText().equals("imprima")){
            this.printTabs();
            System.out.println("System.out.println("+ctx.fargs().getText()+")" + finalLine);
        }
    }

    @Override
    public void exitStm_block(GrammarPortugolParser.Stm_blockContext ctx) {
        nivelAninhamento--;
        this.printTabs();
        System.out.println("}");
    }

    //Função para converter atribuição, tratamento especial para caso do leia
    private void convertExprAssignment(GrammarPortugolParser.ExprContext ctxExpr,  String identificador){
        if(ctxExpr.termo() != null){
            if(ctxExpr.termo().fcall() != null){
                if(ctxExpr.termo().fcall().T_IDENTIFICADOR().getText().equals("leia")){
                    convertLeia(ctxExpr.termo().fcall(), identificador);
                    return;
                }
            }
        }
        String expressao = convertExprConditional(ctxExpr);
        this.printTabs();
        System.out.println(identificador +" = "+ expressao + finalLine);
    }

    //Função que converte expressão condicional
    private String convertExprConditional(GrammarPortugolParser.ExprContext ctxExpr){
        String operator = "";
        if(ctxExpr.termo() != null){
            return ctxExpr.termo().getText();
        }

        if(ctxExpr.operator() != null){
            operator = convertOperator(ctxExpr.operator().getText());
        }

        int qtdExprs = ctxExpr.expr().size();
        if(qtdExprs == 2){
            return  convertExprConditional(ctxExpr.expr(0)) + " "+
                    operator +" "+
                    convertExprConditional(ctxExpr.expr(1));
        }

        return "";
    }

    //Converte o tipo de dado
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

    //Converte a função leia para Java
    private void convertLeia(GrammarPortugolParser.FcallContext ctxFcall, String identificador){
        countLeia++;
        String nomeVariavelLeitura = "ler_"+ countLeia;
        String delcaracaoScanner = "Scanner "+nomeVariavelLeitura+" = new Scanner(System.in);";
        String leitura = "";

        int type = symbolTable.get(identificador);
        if(type == parser.INTEIRO || type == parser.INTEIROS){
            leitura = nomeVariavelLeitura+".nextInt();";
        }else if(type == parser.REAL || type == parser.REAIS){
            leitura = nomeVariavelLeitura+".nextFloat();";
        }else if(type == parser.CARACTERE || type == parser.CARACTERES){
            leitura = nomeVariavelLeitura+".next();";
        }else if(type == parser.LITERAL || type == parser.LITERAIS){
            leitura = nomeVariavelLeitura+".next();";
        }else if(type == parser.LOGICO || type == parser.LOGICOS){
            leitura = nomeVariavelLeitura+".nextBoolean();";
        }


        this.printTabs();
        System.out.println(delcaracaoScanner);
        this.printTabs();
        System.out.println(identificador +" = "+leitura);
    }

    //Converte os operadores
    private String convertOperator(String op){
        String operator = op;
        switch (op)
        {
            case "=":
                operator = "==";
                break;
            case "<>":
                operator = "!=";
                break;
            case "e":
                operator = "&&";
                break;
            case "ou":
                operator = "||";
                break;
            case "nao":
                operator = "!";
                break;
        }
    	return operator;
    }

    private void printTabs(){
        for (int i = 0; i < nivelAninhamento ; i++) {
            System.out.print("\t");
        }
    }
}