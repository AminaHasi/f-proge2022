import java.io._
import de.sciss.chart.api._
class Platform(var tokens: Int, var fiatmoney: Double, var tokenkurs: Double, var months: Int = 1) {
  private var _tokens = tokens
  private var _fiatmoney = fiatmoney
  private var _monthscounter = months
  private var _tokenkurs = tokenkurs
  private var _tokens_prises = List(tokenkurs)

  def Tokens: Int = _tokens

  def Tokens(x: Int) = {
    _tokens = x
  }

  def Fiatmoney: Double = _fiatmoney

  def Fiatmoney(x: Double) = {
    _fiatmoney = x
  }

  def Monthscounter: Int
  = _monthscounter

  def Monthscounter(x: Int) = {
    _monthscounter = x
  }

  def Prices: List[Double] = _tokens_prises

  def Prices(x:Double) = {
    _tokens_prises = _tokens_prises :+ _tokenkurs
  }

  def Tokenkurs: Double = _tokenkurs

  def Tokenkurs(x: Double) = {
    _tokenkurs = x
  }

  def graph_of_tokenprice: Unit = {
    val dataset = Seq(
      ("Ціна токена", for (x <- 1 to _tokens_prises.length by 1)
        yield (x, _tokens_prises(x - 1))
      ))
    val chart = XYLineChart(dataset)
    chart.show(title = "Графік ціни токена")
  }
}