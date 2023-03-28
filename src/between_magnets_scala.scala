import java.util.Scanner

object between_magnets_scala extends App {
  private def TellmeF_Magnets(m1:Double, m2:Double, r:Double) = m1*m2*Math.pow(6.33,10^(-4))/Math.pow(r,2)
  println("m1は何[Wb]?")
   val m1 = new Scanner(System.in).nextDouble()
  println("m2は何[Wb]?")
   val m2 = new Scanner(System.in).nextDouble()
  println("m1,m2間は何[m]?")
   val r = new Scanner(System.in).nextDouble()
  println(TellmeF_Magnets(m1,m2,r))
}