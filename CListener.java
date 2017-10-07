// Generated from C.g4 by ANTLR 4.5.3

	import java.io.*;
	import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#codefile}.
	 * @param ctx the parse tree
	 */
	void enterCodefile(CParser.CodefileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#codefile}.
	 * @param ctx the parse tree
	 */
	void exitCodefile(CParser.CodefileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(CParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(CParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintfStatement(CParser.PrintfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintfStatement(CParser.PrintfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ignoreComments}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreComments(CParser.IgnoreCommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ignoreComments}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreComments(CParser.IgnoreCommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(CParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(CParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(CParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(CParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(CParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(CParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(CParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(CParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(CParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(CParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArraydeclaration(CParser.ArraydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArraydeclaration(CParser.ArraydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#funcDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclare(CParser.FuncDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#funcDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclare(CParser.FuncDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(CParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(CParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(CParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(CParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(CParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(CParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#calllist}.
	 * @param ctx the parse tree
	 */
	void enterCalllist(CParser.CalllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#calllist}.
	 * @param ctx the parse tree
	 */
	void exitCalllist(CParser.CalllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#digitorid}.
	 * @param ctx the parse tree
	 */
	void enterDigitorid(CParser.DigitoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#digitorid}.
	 * @param ctx the parse tree
	 */
	void exitDigitorid(CParser.DigitoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#alltypes}.
	 * @param ctx the parse tree
	 */
	void enterAlltypes(CParser.AlltypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#alltypes}.
	 * @param ctx the parse tree
	 */
	void exitAlltypes(CParser.AlltypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#everyexp}.
	 * @param ctx the parse tree
	 */
	void enterEveryexp(CParser.EveryexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#everyexp}.
	 * @param ctx the parse tree
	 */
	void exitEveryexp(CParser.EveryexpContext ctx);
}