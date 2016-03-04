// Generated from C:/Users/Daria/Documents/IdeaProjects/calclatex/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
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
	 * Visit a parse tree produced by {@link interpreterParser#openblk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenblk(interpreterParser.OpenblkContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#closeblk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseblk(interpreterParser.CloseblkContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(interpreterParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lgcandExpr}
	 * labeled alternative in {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLgcandExpr(interpreterParser.LgcandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(interpreterParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpeqExpr}
	 * labeled alternative in {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpeqExpr(interpreterParser.CmpeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(interpreterParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmprExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmprExpr(interpreterParser.CmprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpr(interpreterParser.NotEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(interpreterParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterExpr(interpreterParser.GreaterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterOrEqExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqExpr(interpreterParser.GreaterOrEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpr(interpreterParser.LessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpr(interpreterParser.ArithExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessOrEqExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqExpr(interpreterParser.LessOrEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(interpreterParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(interpreterParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hiddenMul}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiddenMul(interpreterParser.HiddenMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(interpreterParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(interpreterParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(interpreterParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorMul}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorMul(interpreterParser.VectorMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(interpreterParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inversionExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversionExpr(interpreterParser.InversionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transpExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranspExpr(interpreterParser.TranspExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modOrDet}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOrDet(interpreterParser.ModOrDetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pwrExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPwrExpr(interpreterParser.PwrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primExpr}
	 * labeled alternative in {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimExpr(interpreterParser.PrimExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(interpreterParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcInvoke}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvoke(interpreterParser.FuncInvokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(interpreterParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(interpreterParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(interpreterParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vecIndex}
	 * labeled alternative in {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecIndex(interpreterParser.VecIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matrIndex}
	 * labeled alternative in {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrIndex(interpreterParser.MatrIndexContext ctx);
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