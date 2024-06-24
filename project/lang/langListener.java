// Generated from project/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langParser}.
 */
public interface langListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(langParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(langParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(langParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(langParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(langParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(langParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#bind}.
	 * @param ctx the parse tree
	 */
	void enterBind(langParser.BindContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#bind}.
	 * @param ctx the parse tree
	 */
	void exitBind(langParser.BindContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(langParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(langParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(langParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(langParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(langParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(langParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_expr(langParser.Set_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_expr(langParser.Set_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#edge_expr}.
	 * @param ctx the parse tree
	 */
	void enterEdge_expr(langParser.Edge_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#edge_expr}.
	 * @param ctx the parse tree
	 */
	void exitEdge_expr(langParser.Edge_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(langParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(langParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(langParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(langParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(langParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(langParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#v_filter}.
	 * @param ctx the parse tree
	 */
	void enterV_filter(langParser.V_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#v_filter}.
	 * @param ctx the parse tree
	 */
	void exitV_filter(langParser.V_filterContext ctx);
}
