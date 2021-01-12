object loops {
  def main(args: Array[String]): Unit ={
    var y = 0
    for(y <- 1 to 4)
      println("The current value of y is: " + y)
  }
}
