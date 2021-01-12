object concatstr {
  def main(args: Array[String]): Unit = {
    var str1 = "Hello World!"
    var str2 : String ="Trying hands on with Scala."
    println("First string: " + str1)
    println("Second string: " + str2)
    println("The concatenated string can be either of the two below: \n")
    println(str1 + str2 + " or \n")
    println(str1.concat(str2))
  }
}
