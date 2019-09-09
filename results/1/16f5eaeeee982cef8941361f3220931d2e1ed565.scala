package I0
class I0(val I1: Any) extends I1(I1, I2)
object I1 {
def I2(I2: I0): Any = I2
}
object I2 {
def I2 = new I1()
def I2(I2: Int = 0): Int = 1
}
object I1 {
val I1 = new I0(42).I2
}
}