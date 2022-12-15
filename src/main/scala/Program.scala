import scala.io.StdIn
import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import java.io._
import de.sciss.chart.api._

@main def Program(): Unit = {

  val platform = new Platform(100,10000, 70)
  val exchange = new Exchange(100,10000)

  val newadress: Adress = new Adress("Tokio", "Vyshneva", 15)
  val newmanager = new Manager("Amina", "Gasymova", 18, newadress, 24, 2100, 23000)
  val super_office = new Office("ITbrain", "IT", newmanager)

  val stud_1 = new Student("Santa", "Claus",99, 0, 1000, 241, "business", newadress)
  stud_1.Print_student()
  val stud_2 = new Student("Sviaty", "Mykolai",93, 0, 1000, 241, "business", newadress)



  val tich = new Teacher("Viktor", "Fylypenko", 37, 23, 1000, newadress, 4200, "business")
  tich.MonthEnd(stud_1, tich, platform, exchange)
  platform.Tokenkurs((200/(platform.Tokens + exchange.Tokens).toDouble) * 100)
  platform.Prices(platform.Tokenkurs)

  tich.MonthEnd(stud_2, tich, platform, exchange)
  platform.Tokenkurs((200 / (platform.Tokens + exchange.Tokens).toDouble) * 100)
  platform.Prices(platform.Tokenkurs)

  stud_1.Print_student()
  stud_1.Sell_token(stud_1, exchange, platform)
  platform.Tokenkurs((200 / (platform.Tokens + exchange.Tokens).toDouble) * 100)
  platform.Prices(platform.Tokenkurs)



  println(platform.Prices)
  platform.graph_of_tokenprice
}
