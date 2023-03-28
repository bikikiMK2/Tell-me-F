object between_magnets_scala extends App {
  def TellmeF_Magnets(m1:Double, m2:Double, r:Double): Unit = {
    val k:Double = Math.pow(6.33,10^(-4))
    m1*m2*k/Math.pow(r,2)
  }
  println(TellmeF_Magnets(10,10,100))
}