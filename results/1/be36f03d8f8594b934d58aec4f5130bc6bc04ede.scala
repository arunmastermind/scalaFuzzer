trait I0 { type I1 }
trait i2 { type I1 = i2 }
trait i2 {
type i2 <: i2
type i3 = i2
type I4 = i2
def I4: I4
abstract class i5 extends i2 with i3
val i5: i2
}