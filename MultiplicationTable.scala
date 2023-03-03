import scala.io.StdIn.readInt

object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    println("please enter a number: ")
    val num = readInt()
    for (i <- 1 to 10) {
      if (i != 5) {
        println(num + " x " + i + " = " + (num * i))
      }
    }
  }
}


