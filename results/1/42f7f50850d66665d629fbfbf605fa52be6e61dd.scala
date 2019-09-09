object i0 {
type i1 = Nothing
val I2: 1 = i1
}
object i0 extends i0 {
val i1 = 4
super.I2 implicit object I2 extends this
super.I2 + I2.asInstanceOf[I2]
val i3 = new I4.i1 }