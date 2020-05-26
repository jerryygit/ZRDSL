// Generated from D:/MyWorkSpace/zrDSL-flink/json-dsl/src/main/resources\MingBdJSON.g4 by ANTLR 4.8
package parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MingBdJSONParser}.
 */
public interface MingBdJSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(MingBdJSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(MingBdJSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MingBdJSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MingBdJSONParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(MingBdJSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(MingBdJSONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#runtype}.
	 * @param ctx the parse tree
	 */
	void enterRuntype(MingBdJSONParser.RuntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#runtype}.
	 * @param ctx the parse tree
	 */
	void exitRuntype(MingBdJSONParser.RuntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(MingBdJSONParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(MingBdJSONParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(MingBdJSONParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(MingBdJSONParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#trans}.
	 * @param ctx the parse tree
	 */
	void enterTrans(MingBdJSONParser.TransContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#trans}.
	 * @param ctx the parse tree
	 */
	void exitTrans(MingBdJSONParser.TransContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#dataSource}.
	 * @param ctx the parse tree
	 */
	void enterDataSource(MingBdJSONParser.DataSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#dataSource}.
	 * @param ctx the parse tree
	 */
	void exitDataSource(MingBdJSONParser.DataSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#hbaseSource}.
	 * @param ctx the parse tree
	 */
	void enterHbaseSource(MingBdJSONParser.HbaseSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#hbaseSource}.
	 * @param ctx the parse tree
	 */
	void exitHbaseSource(MingBdJSONParser.HbaseSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#mysqlSource}.
	 * @param ctx the parse tree
	 */
	void enterMysqlSource(MingBdJSONParser.MysqlSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#mysqlSource}.
	 * @param ctx the parse tree
	 */
	void exitMysqlSource(MingBdJSONParser.MysqlSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#mysqlInfo}.
	 * @param ctx the parse tree
	 */
	void enterMysqlInfo(MingBdJSONParser.MysqlInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#mysqlInfo}.
	 * @param ctx the parse tree
	 */
	void exitMysqlInfo(MingBdJSONParser.MysqlInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#mysqlSchema}.
	 * @param ctx the parse tree
	 */
	void enterMysqlSchema(MingBdJSONParser.MysqlSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#mysqlSchema}.
	 * @param ctx the parse tree
	 */
	void exitMysqlSchema(MingBdJSONParser.MysqlSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#transinfo}.
	 * @param ctx the parse tree
	 */
	void enterTransinfo(MingBdJSONParser.TransinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#transinfo}.
	 * @param ctx the parse tree
	 */
	void exitTransinfo(MingBdJSONParser.TransinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(MingBdJSONParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(MingBdJSONParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void enterGroupBy(MingBdJSONParser.GroupByContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void exitGroupBy(MingBdJSONParser.GroupByContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(MingBdJSONParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(MingBdJSONParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(MingBdJSONParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(MingBdJSONParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(MingBdJSONParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(MingBdJSONParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(MingBdJSONParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(MingBdJSONParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#saveInfo}.
	 * @param ctx the parse tree
	 */
	void enterSaveInfo(MingBdJSONParser.SaveInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#saveInfo}.
	 * @param ctx the parse tree
	 */
	void exitSaveInfo(MingBdJSONParser.SaveInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#kafkaSave}.
	 * @param ctx the parse tree
	 */
	void enterKafkaSave(MingBdJSONParser.KafkaSaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#kafkaSave}.
	 * @param ctx the parse tree
	 */
	void exitKafkaSave(MingBdJSONParser.KafkaSaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#mysqlSave}.
	 * @param ctx the parse tree
	 */
	void enterMysqlSave(MingBdJSONParser.MysqlSaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#mysqlSave}.
	 * @param ctx the parse tree
	 */
	void exitMysqlSave(MingBdJSONParser.MysqlSaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#joinpair}.
	 * @param ctx the parse tree
	 */
	void enterJoinpair(MingBdJSONParser.JoinpairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#joinpair}.
	 * @param ctx the parse tree
	 */
	void exitJoinpair(MingBdJSONParser.JoinpairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#kafkaSource}.
	 * @param ctx the parse tree
	 */
	void enterKafkaSource(MingBdJSONParser.KafkaSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#kafkaSource}.
	 * @param ctx the parse tree
	 */
	void exitKafkaSource(MingBdJSONParser.KafkaSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingBdJSONParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(MingBdJSONParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingBdJSONParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(MingBdJSONParser.FieldContext ctx);
}