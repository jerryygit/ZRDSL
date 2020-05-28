import scala.reflect.ClassTag

/**
 * FileName:    Extractor
 * Author:      JERRY
 * Date:        2020/5/28 15:54
 * Description: scala类型擦除应对方案
 */
object Extractor {

  //  def extract[T](list: List[Any]) = list.flatMap {
  //    case element: T => Some(element)
  //    case _ => None
  //  }

  def extract[T](list: List[Any])(implicit tag: ClassTag[T]) =
    list.flatMap {
      case element: T => Some(element)
      case _ => None
    }

  def main(args: Array[String]): Unit = {
    val list = List(1, "string1", List(), "string2")
    val result = Extractor.extract[String](list)
    println(result)
  }
}


