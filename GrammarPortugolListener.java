// Generated from GrammarPortugol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarPortugolParser}.
 */
public interface GrammarPortugolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(GrammarPortugolParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(GrammarPortugolParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#declaracao_algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_algoritmo(GrammarPortugolParser.Declaracao_algoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#declaracao_algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_algoritmo(GrammarPortugolParser.Declaracao_algoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#var_decl_block}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_block(GrammarPortugolParser.Var_decl_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#var_decl_block}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_block(GrammarPortugolParser.Var_decl_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(GrammarPortugolParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(GrammarPortugolParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#tp_primitivo}.
	 * @param ctx the parse tree
	 */
	void enterTp_primitivo(GrammarPortugolParser.Tp_primitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#tp_primitivo}.
	 * @param ctx the parse tree
	 */
	void exitTp_primitivo(GrammarPortugolParser.Tp_primitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#tp_matriz}.
	 * @param ctx the parse tree
	 */
	void enterTp_matriz(GrammarPortugolParser.Tp_matrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#tp_matriz}.
	 * @param ctx the parse tree
	 */
	void exitTp_matriz(GrammarPortugolParser.Tp_matrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#tp_prim_pl}.
	 * @param ctx the parse tree
	 */
	void enterTp_prim_pl(GrammarPortugolParser.Tp_prim_plContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#tp_prim_pl}.
	 * @param ctx the parse tree
	 */
	void exitTp_prim_pl(GrammarPortugolParser.Tp_prim_plContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#stm_block}.
	 * @param ctx the parse tree
	 */
	void enterStm_block(GrammarPortugolParser.Stm_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#stm_block}.
	 * @param ctx the parse tree
	 */
	void exitStm_block(GrammarPortugolParser.Stm_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#stm_list}.
	 * @param ctx the parse tree
	 */
	void enterStm_list(GrammarPortugolParser.Stm_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#stm_list}.
	 * @param ctx the parse tree
	 */
	void exitStm_list(GrammarPortugolParser.Stm_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#stm_ret}.
	 * @param ctx the parse tree
	 */
	void enterStm_ret(GrammarPortugolParser.Stm_retContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#stm_ret}.
	 * @param ctx the parse tree
	 */
	void exitStm_ret(GrammarPortugolParser.Stm_retContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(GrammarPortugolParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(GrammarPortugolParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#stm_attr}.
	 * @param ctx the parse tree
	 */
	void enterStm_attr(GrammarPortugolParser.Stm_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#stm_attr}.
	 * @param ctx the parse tree
	 */
	void exitStm_attr(GrammarPortugolParser.Stm_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#stm_se}.
	 * @param ctx the parse tree
	 */
	void enterStm_se(GrammarPortugolParser.Stm_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#stm_se}.
	 * @param ctx the parse tree
	 */
	void exitStm_se(GrammarPortugolParser.Stm_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#stm_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterStm_enquanto(GrammarPortugolParser.Stm_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#stm_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitStm_enquanto(GrammarPortugolParser.Stm_enquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#stm_para}.
	 * @param ctx the parse tree
	 */
	void enterStm_para(GrammarPortugolParser.Stm_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#stm_para}.
	 * @param ctx the parse tree
	 */
	void exitStm_para(GrammarPortugolParser.Stm_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#passo}.
	 * @param ctx the parse tree
	 */
	void enterPasso(GrammarPortugolParser.PassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#passo}.
	 * @param ctx the parse tree
	 */
	void exitPasso(GrammarPortugolParser.PassoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarPortugolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarPortugolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GrammarPortugolParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GrammarPortugolParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#fcall}.
	 * @param ctx the parse tree
	 */
	void enterFcall(GrammarPortugolParser.FcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#fcall}.
	 * @param ctx the parse tree
	 */
	void exitFcall(GrammarPortugolParser.FcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#fargs}.
	 * @param ctx the parse tree
	 */
	void enterFargs(GrammarPortugolParser.FargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#fargs}.
	 * @param ctx the parse tree
	 */
	void exitFargs(GrammarPortugolParser.FargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GrammarPortugolParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GrammarPortugolParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#func_decls}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decls(GrammarPortugolParser.Func_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#func_decls}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decls(GrammarPortugolParser.Func_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#fvar_decl}.
	 * @param ctx the parse tree
	 */
	void enterFvar_decl(GrammarPortugolParser.Fvar_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#fvar_decl}.
	 * @param ctx the parse tree
	 */
	void exitFvar_decl(GrammarPortugolParser.Fvar_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#fparams}.
	 * @param ctx the parse tree
	 */
	void enterFparams(GrammarPortugolParser.FparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#fparams}.
	 * @param ctx the parse tree
	 */
	void exitFparams(GrammarPortugolParser.FparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPortugolParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(GrammarPortugolParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPortugolParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(GrammarPortugolParser.FparamContext ctx);
}