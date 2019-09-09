class I0 {
type I0 <: I0
def I1: I0.I1 = ???
}
class I2 extends I0 {
val I3: I0
private[I0] abstract class I3
}
object I3 {
val I3: I0 = ???
import I3.I0 {
val I3: Function1.I3.type = new I0
println(I3.I0)
new I0().I3 = this;
}