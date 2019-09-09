class I0[@specialized I1] {
def I1: Any
}
final case object I2 extends I0[I1, I1] { println(I1) }