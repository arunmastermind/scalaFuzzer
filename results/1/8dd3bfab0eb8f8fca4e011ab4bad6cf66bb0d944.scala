object I0 {
def I1(I1: Any) = I1(42)
}
object I3 extends { trait I1 }
trait I1 {
def i2: Any
}
class I3 extends I0