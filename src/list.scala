object list extends App {
  val onetwo = List(1,2)
  val threefour = List(3,4)
  val concatedList = onetwo ::: threefour
  print("onetwo and threefour were not mutated. ")
  print("\n Thus, " + concatedList + "is a new list. ")

  val zeroonetwo = 0 :: onetwo
  print("\n Prepending 0 to onetwo list. ")
  print(zeroonetwo)

  val listinit = 1 :: 2 :: 3 :: Nil
  print("\n Another way of initializing lists: " + listinit + "\n")

  val thrill = List("will", "till", "until")
  print(thrill.count(s => s.length == 4))
}
