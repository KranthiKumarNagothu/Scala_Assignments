import scala.io.StdIn.readInt

object Fibonacci {

  def fibonacci(n: Int): Int = {
    if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val n = readInt()
    println("The Fibonacci series for " + n + " is:")
    for (i <- 0 to n) {
      print(fibonacci(i)+ " ")
    }
  }
}
