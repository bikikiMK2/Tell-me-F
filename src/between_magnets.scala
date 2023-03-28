import java.util.Scanner
import scala.language.postfixOps

object between_magnets extends App {
  println("磁極間に働く電磁力[N]を求めます")
  println("磁極1は何[Wb]?")
  private val m1:Double = new Scanner(System.in).nextDouble()
  println("磁極2は何[Wb]?")
  private val m2:Double = new Scanner(System.in).nextDouble()
  println("磁極間の距離は何[m]?")
  private val r:Double =new Scanner(System.in).nextDouble()
  private val k:Double = Math.pow(6.33,10^(-4))
  private val F:Double = k*m1*m2/r*r
  println("F="+F+"[N]")
}