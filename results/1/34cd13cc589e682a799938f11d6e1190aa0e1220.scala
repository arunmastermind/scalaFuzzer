object I0 {
def I0 = new I0
}
object I1 {
implicit def i2[I1, i2](implicit i2: I0[I1]): I1[final] = sys.error()
}
object I1 extends App {
val i2: I0 = i2.i2 + 1
val i3: i2[Int] = i2
map.immutable.i2.I0(Set.I1)
}