import net.bikikimk2.calcelectromagneticforce.MyValuesType
import java.util.Scanner

object calcElectromagneticForce extends App {
  val calcElectromagneticForce: MyValuesType = new MyValuesType {
    printf("m1は何[Wb]?")
    val m1: Double = new Scanner(System.in).nextDouble()
    printf("m2は何[Wb]?")
    val m2: Double = new Scanner(System.in).nextDouble()
    printf("磁極間は何[m]?")
    val r: Double = new Scanner(System.in).nextDouble()
    override val bettween_magnets_F: Double  = m1 * m2 * bettween_magnets_k / r*r

    printf("F="+bettween_magnets_F+"[N]")
  }
}
