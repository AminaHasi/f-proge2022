class Human(var name: String, var surname: String, var age: Int, var tokens: Int, var fiatmoney: Double, var adress: Adress) {
  private var _name: String = name
  private var _surname: String = surname
  private var _age: Int = age
  private var _tokens: Int = tokens
  private var _fiatmoney: Double = fiatmoney
  private var _adress: Adress = adress

  def Name: String = _name

  def Name(x: String) = {
    _name = x
  }

  def Surname: String = _surname

  def Surname(x: String) = {
    _surname = x
  }

  def Age: Int = _age

  def Age(x: Int) = {
    _age = x
  }

  def Adr: Adress = _adress

  def Tokens: Int = _tokens

  def Tokens(x: Int) = {
    _tokens = x
  }

  def Fiatmoney: Double = _fiatmoney

  def Fiatmoney(x: Double) = {
    _fiatmoney = x
  }

  override def toString: String = s"$name, $surname, $age, $adress, $tokens, $fiatmoney"

  def Print_human(): Unit = println(s"Name: $_name\nSurname: $_surname\nAge: $_age\nAdress: $_adress\nTokens: $_tokens\nFiatmoney: $_fiatmoney")
}
