class Office(var title: String, var department: String, val manager: Manager) {
  private var _office_name: String = title
  private var _department: String = department
  private val _manager: Manager = manager

  def Title: String = _office_name

  def Department: String = _department

  def Manager: Manager = _manager

  override def toString: String = s"$title, $department, $manager"

  def Show_office(): Unit = println(s"Title: $_office_name\nDepartment: $_department\nManager: $_manager")
}