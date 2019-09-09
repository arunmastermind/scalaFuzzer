trait i0 {
def I1: Any
}
type I1 = { def I2: Any }
trait i3 {
type I4 = I2
def ::[i3](I5: I1 => String): I1 = I5
def I5 = new I1
(??? : Any)
}