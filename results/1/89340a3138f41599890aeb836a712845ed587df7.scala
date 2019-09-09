class I0
object I0 {
type i1
type i2[i1, i2] = i2
}
object i3 extends i2[Boolean]
class i4 extends i2 with I0[I5, i2]