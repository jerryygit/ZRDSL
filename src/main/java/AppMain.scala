import java.io.{File, FileInputStream}

import dsl.MyLoaderDsl
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import parse.{MingBdJSONLexer, MingBdJSONParser}

object AppMain {
  def main(args: Array[String]): Unit = {
    val file = new File("src/main/resources/example.json")
    val in = new FileInputStream(file)
    val input = new ANTLRInputStream(in)
    val lexer = new MingBdJSONLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new MingBdJSONParser(tokens)
    parser.setBuildParseTree(true)
    val tree = parser.json
    val walker = new ParseTreeWalker
    val converter = new MyLoaderDsl
    walker.walk(converter, tree)
  }
}
