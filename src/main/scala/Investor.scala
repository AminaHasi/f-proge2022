class Investor(name: String, surname: String, age: Int, adress: Adress, tokens: Int, fiatmoney: Double, wealth: Int)
  extends Human(name, surname, age, tokens, fiatmoney, adress) {
  private var _wealth: Int = wealth

  def Capital: Int = _wealth

  def Capital(x: Int) = {
    _wealth = x
  }

  override def toString: String = super.toString() + s"$wealth"
}
