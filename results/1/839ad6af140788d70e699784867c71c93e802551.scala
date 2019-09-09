trait I0 {
trait I0 {
trait i1
trait i1
}
trait i2
type i3 = { type i1 = I0 }
type i2 <: i3
val i3: i1 | i2 = null;
val I0: i2 with i2 { type i1 = i2 }
var i3: i3.I0 = this
val I0 = I0 i3 < 90
}