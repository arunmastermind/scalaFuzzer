abstract class i0 {
type I1
type I2
type i3 <: i4
type i3 <: I1
type i4 <: i3
trait I5 { type i3 = Int }
type i6 = Stream[i7]
val I5: i4[i4] = i6.I5
}