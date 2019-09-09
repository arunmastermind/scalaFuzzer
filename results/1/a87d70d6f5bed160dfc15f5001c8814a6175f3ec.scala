trait I0 {
def I1(I2: Int): Int
def I2(I2: Int): Int = {
I1(I2 = 1)
}
class I3 extends I0 {
object I1 extends I2
I3(0) += 1
val I2 = new {
val I2 = (this.I2) new I2()
case None =>
}
}