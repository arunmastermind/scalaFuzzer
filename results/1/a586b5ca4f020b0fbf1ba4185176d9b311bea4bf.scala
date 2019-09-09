class i0 {
type i0
final case class _
object i0 extends i0
object I1 extends i0
case object I1 extends i0
sealed abstract class i2 extends I1 with I1
final case class i2()
val i0: i0 = I1
}
Symbol def I3 = new i2[Int]
new i0(i0)
println(i2 == I3)