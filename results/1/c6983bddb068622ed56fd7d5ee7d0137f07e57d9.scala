class I0
object I0 {
type i1
type i2[i1, i3] = i2
}
object i3 extends i2[Boolean]
class I4 extends i3 with I0[I4, i2]