// Generated from /home/willie/Desktop/Test Java COOL/ANTLR_COOL_Program/COOL.g4 by ANTLR 4.7.2
package ANTLR_COOL_Program;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link COOLParser}.
 */
public interface COOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(COOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterClasses(COOLParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitClasses(COOLParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterEof(COOLParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitEof(COOLParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(COOLParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(COOLParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterMethod(COOLParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitMethod(COOLParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterProperty(COOLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitProperty(COOLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(COOLParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(COOLParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLetIn(COOLParser.LetInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLetIn(COOLParser.LetInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(COOLParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(COOLParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(COOLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(COOLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(COOLParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(COOLParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterWhile(COOLParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitWhile(COOLParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(COOLParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(COOLParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(COOLParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(COOLParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(COOLParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(COOLParser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(COOLParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(COOLParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock(COOLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock(COOLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(COOLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(COOLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(COOLParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(COOLParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIf(COOLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIf(COOLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCase(COOLParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCase(COOLParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOwnMethodCall(COOLParser.OwnMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOwnMethodCall(COOLParser.OwnMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(COOLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(COOLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(COOLParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(COOLParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(COOLParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(COOLParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(COOLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(COOLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(COOLParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(COOLParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(COOLParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(COOLParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(COOLParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(COOLParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(COOLParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(COOLParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(COOLParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(COOLParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(COOLParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(COOLParser.MethodCallContext ctx);
}