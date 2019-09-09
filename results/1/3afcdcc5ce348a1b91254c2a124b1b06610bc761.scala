abstract class I0 {
val I0: PartialFunction[Int, Int] = new I0
def I1[I1 <: Boolean](I1: I0): I0 = new I0(I1)
}
trait I1[+I0, +I1[I1]] {
def apply(I1: I0[Int, Int]): Unit = if (I1 == 0) else (I1)
}