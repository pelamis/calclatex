package com.bmstu;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daria on 04.03.2016.
 */
public class doubleVisitor extends  interpreterBaseVisitor<Double> {

    @Override public Double visitAddExpr(interpreterParser.AddExprContext ctx) {
        Double left = visit(ctx.expr());
        Double right = visit(ctx.term());
        System.out.println(left+right);
        return left + right;
        //return visitChildren(ctx);
    }

    @Override public Double visitSubExpr(interpreterParser.SubExprContext ctx) {
        Double left = visit(ctx.expr());
        Double right = visit(ctx.term());
        System.out.println(left - right);
        return left - right;
    }

    @Override public Double visitHiddenMul(interpreterParser.HiddenMulContext ctx) {
        Double left = visit(ctx.term());
        Double right = visit(ctx.factor());
        System.out.println(left * right);
        return left * right;
    }

    @Override public Double visitMulExpr(interpreterParser.MulExprContext ctx) {
        Double left = visit(ctx.term());
        Double right = visit(ctx.factor());
        System.out.println(left * right);
        return left * right;
    }


    @Override public Double visitDivExpr(interpreterParser.DivExprContext ctx) {
        Double left = visit(ctx.term());
        Double right = visit(ctx.factor());
        Double res = (right != 0) ? left / right : Double.NaN;
        System.out.println(res);
        return res;
    }

    @Override public Double visitParExpr(interpreterParser.ParExprContext ctx) {
        return visit(ctx.lgcexpr());
    }

    @Override public Double visitDoubleVal(interpreterParser.DoubleValContext ctx) {
        return Double.valueOf(ctx.NUM().getText());
    }

}
