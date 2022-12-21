import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble

@main def Start_calculating(): Unit = {

  println("Введіть перше число:")
  val number1: Komplex = new Komplex(readInt(), readInt())
  println("Перше число: "+number1)
  println("Введіть оператор(+, -, *, /):")
  val operation: String = readLine()

  operation match {
    case "+" =>
      println("Введіть друге число:")
      val number2: Komplex = new Komplex(readInt(), readInt())
      println("Друге число: "+number2)
      val result: Komplex = number1 + number2
      println("Результат: "+result)


    case "-" =>
      println("Введіть друге число:")
      val number2: Komplex = new Komplex(readInt(), readInt())
      println("Друге число: "+number2)
      val result: Komplex = number1 - number2
      println("Результат: "+result)


    case "*" =>
      println("Введіть друге число:")
      val number2: Komplex = new Komplex(readInt(), readInt())
      println("Друге число: "+number2)
      val result: Komplex = number1 * number2
      println("Результат: "+result)


    case "/" =>
      println("Введіть друге число:")
      val number2: Komplex = new Komplex(readInt(), readInt())
      println("Друге число: "+number2)
      val result: Komplex = number1 / number2
      println("Результат: "+result)

  }
}