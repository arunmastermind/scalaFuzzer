class I0[@specialized I0] {
def I1: Any
}
final case object I1 extends I0[I0, I1] { println(I0) }