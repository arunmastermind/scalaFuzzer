trait I0 {
val i1 = 2
val i1 = 4
val i2: I0 { type i1 = i1 }; def apply(i2: I0 => Int) = this }
class I3