// Generated from OBBYParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OBBYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OBBYParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OBBYParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OBBYParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OBBYParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolder(OBBYParser.FolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link OBBYParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(OBBYParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OBBYParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(OBBYParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OBBYParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(OBBYParser.NumContext ctx);
}