import java.io.{File, FileInputStream}

import invoke.MyLoaderInvoke
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import parse.{MingBdJSONLexer, MingBdJSONParser}

/**
 * FileName:    AppMain
 * Author:      JERRY
 * Date:        2020/5/13 17:20
 * Description: 项目入口
 */
object AppMain extends App {
  //  val fileName = new File("json-dsl/src/main/resources/exampleBatch.json")
  val fileName = new File("json-dsl\\src\\main\\resources\\example.json")
  val in = new FileInputStream(fileName)
  val input = new ANTLRInputStream(in)
  val lexer = new MingBdJSONLexer(input)
  val tokens = new CommonTokenStream(lexer)
  val parser = new MingBdJSONParser(tokens)
  parser.setBuildParseTree(true)
  val tree = parser.json
  val walker = new ParseTreeWalker
  val converter = new MyLoaderInvoke
  walker.walk(converter, tree)
}
