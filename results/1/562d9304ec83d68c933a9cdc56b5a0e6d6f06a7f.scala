trait i0 { type i1 }
trait i1 { type i1 = i1 }
trait i1 {
type i1 <: i1
type i1 = i1
type I2 = i1
def i3: I2
abstract class i4 extends i1 with i1
val i4: i1
}