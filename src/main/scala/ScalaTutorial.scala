/**
 * Created by leo on 15/9/28.
 */
object ScalaTutorial {
  def main(args: Array[String]) {
    val ints = Seq(1,2,3,4,5)
    val intsa = ints.filter(n => n % 2 == 0)
    printf(intsa + "\n")

    //Immutable Map
    val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Lucy")
    if(employees.contains("Manager")){
      printf("Manager : %s\n", employees.get("Manager"))
    }

    //Mutable Map
    val customers = collection.mutable.Map(100 -> "Leo Paul", 101 -> "lili Blair")
    printf("Customer 1 : %s\n", customers.get(100))
    printf("Customer 1 : %s\n", customers(100))

    // Change the value of a mutable map.
    customers(100) = "Tom jenkins"
    printf("Customer 1 : %s\n", customers(100))

    //we can also add a new element to a mutable map.
    customers(102) = "Tayler swift"
    for ((k, v) <- customers) {
      printf("%d, %s\n", k, v)
    }

    //Tuple example
    val tupleValue = (443, "leo bworn", "basketball")
    printf("%s's favorite sport is %s.\n", tupleValue._2, tupleValue._3)

    //Iterate the tuple
    tupleValue.productIterator.foreach(v => println(v))

    //toString method of a tuple object.
    println(tupleValue.toString() )
  }
}
