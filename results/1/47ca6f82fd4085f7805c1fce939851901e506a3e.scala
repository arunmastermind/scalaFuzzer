class I0 {
val I0: Int => Float => String = true
}
private object I1 {
import I0.{ I0, I1 with I0 =>
type I1 <: I1#I1 }
type I1 = I0#I1 with val I0
}
class I1 {
def I1(I1: I0 => Boolean): Unit = ???
}