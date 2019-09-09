object I0 {
abstract class i1 {
type i1
def i2: i1
}
object i3 {
implicit def i3[i4]: i4 { type i4 <: i1.i2 }
type i5 = i4.i1
}