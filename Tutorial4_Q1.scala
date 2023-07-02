object Tutorial4_Q1 {
  def main(args: Array[String]): Unit = {

    print("Your Deposit Amount :")
    val d_amount = scala.io.StdIn.readDouble();

    println("Interest : " + calculateInterest(d_amount));
  }

  def calculateInterest(d_amount: Double): Double = {
    val Final_interest = d_amount match {
      case d_amount if d_amount <= 20000 => d_amount * 0.02
      case d_amount if d_amount <= 200000 => d_amount * 0.04
      case d_amount if d_amount <= 2000000 => d_amount * 0.035
      case _ => d_amount * 0.065
    }
    Final_interest
  }
}