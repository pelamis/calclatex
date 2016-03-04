// Generated from C:/Users/Daria/Documents/IdeaProjects/calclatex/src/com/bmstu\interpreter.g4 by ANTLR 4.5.1
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
	 * Enter a parse tree produced by {@link interpreterParser#openblk}.
	 * @param ctx the parse tree
	 */
	void enterOpenblk(interpreterParser.OpenblkContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#openblk}.
	 * @param ctx the parse tree
	 */
	void exitOpenblk(interpreterParser.OpenblkContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#closeblk}.
	 * @param ctx the parse tree
	 */
	void enterCloseblk(interpreterParser.CloseblkContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#closeblk}.
	 * @param ctx the parse tree
	 */
	void exitCloseblk(interpreterParser.CloseblkContext ctx);
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
	 * Enter a parse tree produced by the {@code lgcandExpr}
	 * labeled alternative in {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 */
	void enterLgcandExpr(interpreterParser.LgcandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lgcandExpr}
	 * labeled alternative in {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 */
	void exitLgcandExpr(interpreterParser.LgcandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(interpreterParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link interpreterParser#lgcexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(interpreterParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpeqExpr}
	 * labeled alternative in {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 */
	void enterCmpeqExpr(interpreterParser.CmpeqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpeqExpr}
	 * labeled alternative in {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 */
	void exitCmpeqExpr(interpreterParser.CmpeqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(interpreterParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link interpreterParser#lgcand}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(interpreterParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmprExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void enterCmprExpr(interpreterParser.CmprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmprExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void exitCmprExpr(interpreterParser.CmprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(interpreterParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(interpreterParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(interpreterParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link interpreterParser#cmpeq}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(interpreterParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExpr(interpreterParser.GreaterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExpr(interpreterParser.GreaterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterOrEqExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqExpr(interpreterParser.GreaterOrEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterOrEqExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqExpr(interpreterParser.GreaterOrEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void enterLessExpr(interpreterParser.LessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void exitLessExpr(interpreterParser.LessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(interpreterParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(interpreterParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessOrEqExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqExpr(interpreterParser.LessOrEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessOrEqExpr}
	 * labeled alternative in {@link interpreterParser#cmpr}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqExpr(interpreterParser.LessOrEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(interpreterParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(interpreterParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(interpreterParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(interpreterParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiddenMul}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterHiddenMul(interpreterParser.HiddenMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiddenMul}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitHiddenMul(interpreterParser.HiddenMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(interpreterParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(interpreterParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(interpreterParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(interpreterParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(interpreterParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(interpreterParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorMul}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVectorMul(interpreterParser.VectorMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorMul}
	 * labeled alternative in {@link interpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVectorMul(interpreterParser.VectorMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(interpreterParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(interpreterParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inversionExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterInversionExpr(interpreterParser.InversionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inversionExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitInversionExpr(interpreterParser.InversionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transpExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterTranspExpr(interpreterParser.TranspExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transpExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitTranspExpr(interpreterParser.TranspExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modOrDet}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterModOrDet(interpreterParser.ModOrDetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modOrDet}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitModOrDet(interpreterParser.ModOrDetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pwrExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPwrExpr(interpreterParser.PwrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pwrExpr}
	 * labeled alternative in {@link interpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPwrExpr(interpreterParser.PwrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primExpr}
	 * labeled alternative in {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPrimExpr(interpreterParser.PrimExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primExpr}
	 * labeled alternative in {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPrimExpr(interpreterParser.PrimExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(interpreterParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link interpreterParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(interpreterParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcInvoke}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvoke(interpreterParser.FuncInvokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcInvoke}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvoke(interpreterParser.FuncInvokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void enterId(interpreterParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void exitId(interpreterParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(interpreterParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(interpreterParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void enterAtom(interpreterParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link interpreterParser#prim}.
	 * @param ctx the parse tree
	 */
	void exitAtom(interpreterParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecIndex}
	 * labeled alternative in {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void enterVecIndex(interpreterParser.VecIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecIndex}
	 * labeled alternative in {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void exitVecIndex(interpreterParser.VecIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matrIndex}
	 * labeled alternative in {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void enterMatrIndex(interpreterParser.MatrIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matrIndex}
	 * labeled alternative in {@link interpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void exitMatrIndex(interpreterParser.MatrIndexContext ctx);
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