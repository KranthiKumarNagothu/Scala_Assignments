object Factorial {
  def factorial(num: Int): Int = {
    if (num == 0 || num == 1) 1
    else num * factorial(num - 1)
  }

  def main(args: Array[String]) {
    val num = 5
    val result = factorial(num)
    println(s"The factorial of $num is: $result")
  }
}
