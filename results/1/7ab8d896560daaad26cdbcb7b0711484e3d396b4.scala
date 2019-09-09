object I0 {
class I1[-I2]
object I2 {
implicit val I3 = new I0
val i4: I0[String] = new I0[List](I1)
}
object i5 {
object I0(implicit I3: I0[Any])
I1[I2] {}
}