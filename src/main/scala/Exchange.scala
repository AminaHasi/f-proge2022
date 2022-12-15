class Exchange(var tokens: Int, var fiatmoney: Double) {
  private var _tokens = tokens
  private var _fiatmoney = fiatmoney

  def Tokens: Int = _tokens

  def Tokens(x: Int) = {
    _tokens = x
  }

  def Fiatmoney: Double = _fiatmoney

  def Fiatmoney(x: Double) = {
    _fiatmoney = x
  }
}