object i0 {
trait i0[I2]
trait I2[I2[_], I2]
extends i0[I2] with I2[Long, i0]
trait I2[I2[I2]]
object I2 {
implicit val i0: I2[I2] = new i0[I2] {}
}
class i0 extends i0[I2, I2] {
def i0(i0: I2[I1, I2]): i0 = ???
def i0(I1: Any) = 1
}
object I1 extends i0