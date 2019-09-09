object i0 {
def I1(I1: Any) = I1(42)
}
object i3 extends { trait I1 }
trait I1 {
def i2: Any
}
class i4 extends i0