class Adress(var city: String, var street: String, var homenumber: Int) {
  override def toString: String = s"$city, $street, $homenumber"
}
