//object testworksheet {
  println("My First Scala worksheet")
  var num1 : Int = 8
  //8 is also an object
  var num2 = 9
  println(num1+num2)

  val x = 23
  var res = 8 + 7

  //here, + is not an operator, it is a function,
  //so its operator overloading
  var result = 8.+(7)
 //in above, 8 is an obj, . is operator, + func and 7 its parameter
//now we cant change value of x by mutation: x =24
//because x is a constant var
//}
//We don't have primitive data types in scala, even int is a class