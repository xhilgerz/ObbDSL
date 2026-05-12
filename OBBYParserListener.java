// Generated from OBBYParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OBBYParser}.
 */
public interface OBBYParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OBBYParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OBBYParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OBBYParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OBBYParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OBBYParser#folder}.
	 * @param ctx the parse tree
	 */
	void enterFolder(OBBYParser.FolderContext ctx);
	/**
	 * Exit a parse tree produced by {@link OBBYParser#folder}.
	 * @param ctx the parse tree
	 */
	void exitFolder(OBBYParser.FolderContext ctx);
	/**
	 * Enter a parse tree produced by {@link OBBYParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(OBBYParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OBBYParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(OBBYParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OBBYParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(OBBYParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OBBYParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(OBBYParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OBBYParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(OBBYParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link OBBYParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(OBBYParser.NumContext ctx);
}