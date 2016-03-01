// Generated from D:/Google Drive/vault/Courseproj/interpteter/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
package com.bmstu;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link interpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface interpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link interpreterParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(interpreterParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(interpreterParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#cnstrct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnstrct(interpreterParser.CnstrctContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLgcexpr(interpreterParser.LgcexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLgcand(interpreterParser.LgcandContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpeq(interpreterParser.CmpeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpr(interpreterParser.CmprContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(interpreterParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(interpreterParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(interpreterParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(interpreterParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(interpreterParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(interpreterParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#vect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVect(interpreterParser.VectContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#matr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatr(interpreterParser.MatrContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(interpreterParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#assgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgn(interpreterParser.AssgnContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#lop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLop(interpreterParser.LopContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#rop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRop(interpreterParser.RopContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(interpreterParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#cond1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond1(interpreterParser.Cond1Context ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#mcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMcase(interpreterParser.McaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#mdefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdefault(interpreterParser.MdefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(interpreterParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#loopcnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopcnd(interpreterParser.LoopcndContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(interpreterParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(interpreterParser.ArgsContext ctx);
}