package com.bmstu;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {

    public static void main(String[] args) throws Exception{
	    ANTLRInputStream input = new ANTLRInputStream(System.in);
        interpreterLexer lexer = new interpreterLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        interpreterParser parser = new interpreterParser(tokens);
        ParseTree tree = parser.start();
        System.out.println(tree.toStringTree(parser));
    }
}
