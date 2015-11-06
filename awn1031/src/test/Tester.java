/**
 * 
 */
package test;

import java.io.FileInputStream;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import base.Tnode;

import antlr.MyVisitor;
import antlr.awn1027BaseVisitor;
import antlr.awn1027Lexer;
import antlr.awn1027Parser;

/**
 * @author Administrator
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//create a Char Stream that reads from standard input
		ANTLRInputStream input=new ANTLRInputStream(new FileInputStream("test.awn"));
		//create a lexer that feeds off of input CharStream
		awn1027Lexer lexer=new awn1027Lexer(input);
		//create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens=new CommonTokenStream(lexer);
		//create a parser that feeds off the tokens buffer
		awn1027Parser parser=new awn1027Parser(tokens);
		ParseTree tree=parser.additiveExpr(0);//begin parsing at init rule
		
		MyVisitor eval=new MyVisitor();
		int a = eval.visit(tree).val;
		System.out.println("a = "+a);
		System.out.println(tree.toStringTree(parser));//print LISP-style tree
	}

}
