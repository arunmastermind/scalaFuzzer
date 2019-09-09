trait I0 { def I1: Int }
trait I2 extends I0
object I2 {
implicit def I3(I3: => Double): Int = 0
val I4: I2 = null
def I4(I5: Int) = I2 match {
case _ => I2(I4.I3)
}
}