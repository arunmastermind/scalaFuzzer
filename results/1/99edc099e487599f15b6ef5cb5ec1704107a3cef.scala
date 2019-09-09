trait I0 {
def I0: Any
}
type I0 = { def i1: Any }
trait i1 {
type i2 = i1
def ::[i1](I3: I0 => String): I0 = I3
def I4 = new I0
(??? : Any)
}