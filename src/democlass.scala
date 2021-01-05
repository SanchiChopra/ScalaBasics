object democlass {

  case class Student(var rollno : Int = 1, var name : String = "Sanchi", var marks : Int = 91)
  //1, Sanchi, 91 are default values assigned
  {
    
  }
  var s1 = Student()
  var s2 = Student(4, "Kaira", 78)
  var s3 = Student(5)
  var s4 = Student(name = "Rahul")
}
