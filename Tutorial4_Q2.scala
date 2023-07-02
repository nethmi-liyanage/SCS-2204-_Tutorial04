object Tutorial4_Q2 {
  def main(args: Array[String]): Unit = {
    print("Input a number: ")
    val number = scala.io.StdIn.readInt()

    println("The number that you've input is " + message(number))
  }

  def message(n: Int): String = n match {
    case n if n <= 0 => "a Negative number or a Zero."
    case n if n % 2 == 0 => "an Even Number."
    case _ => "an Odd Number."
  }
}