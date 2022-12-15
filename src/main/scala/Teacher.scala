class Teacher(name: String, surname: String, age: Int, tokens: Int, fiatmoney: Double, adress: Adress, salary: Int, preferences: String)
  extends Human(name, surname, age, tokens, fiatmoney, adress) {                                                                            
  private var _salary: Int = salary
  private var _preferences: String = preferences

  def Salary: Int = _salary

  def Salary(x: Int) = {
    _salary = x
  }

  def Preferences_t: String = _preferences

  def Preferences_t(x: String) = {
    _preferences = x
  }

  override def toString: String = super.toString() + s"$salary"

  def MarkForStudent: Int = (Math.random() * (6 - 1) + 1).toInt
  def MonthEnd(x: Student, y: Teacher, z:Platform, w:Exchange): Unit = if (x.Preferences_s == y.Preferences_t) {
    x.Mark(y.MarkForStudent)
    x.Mark match {
      case 1 => {
        z.Tokens(z.Tokens - 1)
        x.Tokens(x.Tokens + 1)
      }
      case 2 => {
        z.Tokens(z.Tokens - 5)
        x.Tokens(x.Tokens + 5)
      }
      case 3 => {
        z.Tokens(z.Tokens - 10)
        x.Tokens(x.Tokens + 10)
      }
      case 4 => {
        z.Tokens(z.Tokens - 15)
        x.Tokens(x.Tokens + 15)
      }
      case 5 => {
        z.Tokens(z.Tokens - 20)
        x.Tokens(x.Tokens + 20)
      }
    }
    z.Monthscounter(z.Monthscounter + 1)
    y.Fiatmoney(y.Fiatmoney + y.Salary)
  }
}
