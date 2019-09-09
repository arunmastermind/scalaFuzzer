object I0 {
trait I0 {
val i1: AnyRef }
type i1 <: I0
type I2 <: i1 with I0
val I2 = new i1
def main(I2: Array[String]): Unit =
I2(i1)
}