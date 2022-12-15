import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

class Student(name: String, surname: String, age: Int, tokens: Int, fiatmoney: Double, group: Int, preferences: String, adress: Adress, mark: Int = 0)
  extends Human(name, surname, age, tokens, fiatmoney, adress), token_shop() {
  private var _group: Int = group
  private var _mark: Int = 0
  private var _preferences: String = preferences

  override def toString: String = super.toString() + s"$group, $mark"

  def Print_student(): Unit = println(s"Group: $_group\nMark: $_mark")

  def Group: Int = _group

  def Group(x: Int) = {
    _group = x
  }

  def Mark: Int = _mark

  def Mark(x: Int) = {
    _mark = x
  }

  def Preferences_s: String = _preferences

  def Preferences_s(x: String) = {
    _preferences = x
  }
  
}

trait token_shop() {
  def Sell_token(x: Student, y: Exchange, z: Platform): Unit = {
    y.Tokens(y.Tokens + x.Tokens)
    x.Tokens(0)
    y.Fiatmoney(y.Fiatmoney - (x.Tokens * z.Tokenkurs))
    x.Fiatmoney(x.Fiatmoney + (x.Tokens * z.Tokenkurs))
    println("Tokens were sold successfully")
  }

  def Buy_token(x: Student, y: Exchange, z: Platform): Unit = {
    println("Write count of tokens you want to bye")
    val i: Int = readInt()
    x.Fiatmoney(x.Fiatmoney - (i * z.Tokenkurs))
    y.Fiatmoney(y.Fiatmoney + (i * z.Tokenkurs))
    y.Tokens(y.Tokens - i)
    x.Tokens(x.Tokens + i)
  }
}