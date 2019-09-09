class i0[@specialized I1] {
def i2: Any
}
final case object i2 extends i0[I1, i2] { println(I1) }