class Komplex(val real: Double, val imagine: Double) {
  override def toString = real + (if (imagine < 0) "-" + -imagine else "+" + imagine) + "*i"

  def +(value: Komplex) = new Komplex(real + value.real, imagine + value.imagine)

  def -(value: Komplex) = new Komplex(real - value.real, imagine - value.imagine)

  def *(value: Komplex) = new Komplex(real * value.real - imagine * value.imagine, real * value.imagine + imagine * value.real)

  def /(value: Komplex) = new Komplex((real * value.real + imagine * value.imagine) / (value.real * value.real + value.imagine * value.imagine),
    (imagine * value.real - real * value.imagine) / (value.real * value.real + value.imagine * value.imagine))
}