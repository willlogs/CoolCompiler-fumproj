// Generated from /home/willie/Desktop/Test Java COOL/ANTLR_COOL_Program/COOL.g4 by ANTLR 4.7.2
package ANTLR_COOL_Program;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COOLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(COOLParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(COOLParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(COOLParser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(COOLParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(COOLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(COOLParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetIn(COOLParser.LetInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(COOLParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(COOLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(COOLParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(COOLParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(COOLParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(COOLParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(COOLParser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(COOLParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(COOLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(COOLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(COOLParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(COOLParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(COOLParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnMethodCall(COOLParser.OwnMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(COOLParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(COOLParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(COOLParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(COOLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(COOLParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(COOLParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(COOLParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(COOLParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(COOLParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(COOLParser.MethodCallContext ctx);
}