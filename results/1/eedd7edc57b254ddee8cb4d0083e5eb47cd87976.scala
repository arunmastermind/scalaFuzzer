trait i0 {
def I1: Any
}
type I2 = { def I2: Any }
trait I2 {
type i3 = I2
def ::[I2](i3: I2 => String): I1 = i3
def i3 = new I2
(??? : Any)
}