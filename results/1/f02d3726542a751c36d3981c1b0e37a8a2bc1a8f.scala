object I0 {
trait I0 {
val I1: AnyRef }
type I2 <: I0
type I2 <: I1 with I0
val I3 = new I1
def main(I4: Array[String]): Unit =
I4(I1)
}