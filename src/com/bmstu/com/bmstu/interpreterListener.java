// Generated from D:/Google Drive/vault/Courseproj/interpteter/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
package com.bmstu;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link interpreterParser}.
 */
public interface interpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link interpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(interpreterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(interpreterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(interpreterParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(interpreterParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#cnstrct}.
	 * @param ctx the parse tree
	 */
	void enterCnstrct(interpreterParser.CnstrctContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#cnstrct}.
	 * @param ctx the parse tree
	 */
	void exitCnstrct(interpreterParser.CnstrctContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 */
	void enterLgcexpr(interpreterParser.LgcexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 */
	void exitLgcexpr(interpreterParser.LgcexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 */
	void enterLgcand(interpreterParser.LgcandContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 */
	void exitLgcand(interpreterParser.LgcandContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void enterCmpeq(interpreterParser.CmpeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void exitCmpeq(interpreterParser.CmpeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void enterCmpr(interpreterParser.CmprContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void exitCmpr(interpreterParser.CmprContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(interpreterParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(interpreterParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(interpreterParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(interpreterParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(interpreterParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(interpreterParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(interpreterParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(interpreterParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void enterPrim(interpreterParser.PrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void exitPrim(interpreterParser.PrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(interpreterParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(interpreterParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#vect}.
	 * @param ctx the parse tree
	 */
	void enterVect(interpreterParser.VectContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#vect}.
	 * @param ctx the parse tree
	 */
	void exitVect(interpreterParser.VectContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#matr}.
	 * @param ctx the parse tree
	 */
	void enterMatr(interpreterParser.MatrContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#matr}.
	 * @param ctx the parse tree
	 */
	void exitMatr(interpreterParser.MatrContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(interpreterParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(interpreterParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#assgn}.
	 * @param ctx the parse tree
	 */
	void enterAssgn(interpreterParser.AssgnContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#assgn}.
	 * @param ctx the parse tree
	 */
	void exitAssgn(interpreterParser.AssgnContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#lop}.
	 * @param ctx the parse tree
	 */
	void enterLop(interpreterParser.LopContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#lop}.
	 * @param ctx the parse tree
	 */
	void exitLop(interpreterParser.LopContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#rop}.
	 * @param ctx the parse tree
	 */
	void enterRop(interpreterParser.RopContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#rop}.
	 * @param ctx the parse tree
	 */
	void exitRop(interpreterParser.RopContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(interpreterParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(interpreterParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#cond1}.
	 * @param ctx the parse tree
	 */
	void enterCond1(interpreterParser.Cond1Context ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#cond1}.
	 * @param ctx the parse tree
	 */
	void exitCond1(interpreterParser.Cond1Context ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#mcase}.
	 * @param ctx the parse tree
	 */
	void enterMcase(interpreterParser.McaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#mcase}.
	 * @param ctx the parse tree
	 */
	void exitMcase(interpreterParser.McaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#mdefault}.
	 * @param ctx the parse tree
	 */
	void enterMdefault(interpreterParser.MdefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#mdefault}.
	 * @param ctx the parse tree
	 */
	void exitMdefault(interpreterParser.MdefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(interpreterParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(interpreterParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#loopcnd}.
	 * @param ctx the parse tree
	 */
	void enterLoopcnd(interpreterParser.LoopcndContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#loopcnd}.
	 * @param ctx the parse tree
	 */
	void exitLoopcnd(interpreterParser.LoopcndContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(interpreterParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(interpreterParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(interpreterParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(interpreterParser.ArgsContext ctx);
}