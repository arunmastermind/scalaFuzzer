object I0 {
val i1: Any = new { def I2: Int }
class I2 extends I0 { override def i1 = super.i1 }
object I3 extends i1 {
val I2: Int = 1
}