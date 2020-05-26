// Generated from D:/MyWorkSpace/zrDSL-flink/src/main/resources\MingBdJSON.g4 by ANTLR 4.8
package parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MingBdJSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MingBdJSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(MingBdJSONParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MingBdJSONParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(MingBdJSONParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#runtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntype(MingBdJSONParser.RuntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(MingBdJSONParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(MingBdJSONParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#trans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans(MingBdJSONParser.TransContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#dataSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSource(MingBdJSONParser.DataSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#hbaseSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHbaseSource(MingBdJSONParser.HbaseSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#mysqlSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlSource(MingBdJSONParser.MysqlSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#mysqlInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlInfo(MingBdJSONParser.MysqlInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#mysqlSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlSchema(MingBdJSONParser.MysqlSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#transinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransinfo(MingBdJSONParser.TransinfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(MingBdJSONParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#groupBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBy(MingBdJSONParser.GroupByContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(MingBdJSONParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCols(MingBdJSONParser.ColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol(MingBdJSONParser.ColContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#save}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave(MingBdJSONParser.SaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#saveInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveInfo(MingBdJSONParser.SaveInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#kafkaSave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKafkaSave(MingBdJSONParser.KafkaSaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#mysqlSave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlSave(MingBdJSONParser.MysqlSaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#joinpair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinpair(MingBdJSONParser.JoinpairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#kafkaSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKafkaSource(MingBdJSONParser.KafkaSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingBdJSONParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(MingBdJSONParser.FieldContext ctx);
}