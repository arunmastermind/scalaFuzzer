object I0 {
def I1(i2: Any) = i2(42)
}
object I4 extends { trait I1 }
trait i2 {
def I3: Any
}
class I4 extends I0