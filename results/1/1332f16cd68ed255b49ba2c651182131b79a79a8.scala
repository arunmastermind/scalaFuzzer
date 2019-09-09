class i0(I1: Int) {
def I2 = i3 }
class i3 {
val i4 = new i0
new i3.I2() }
}
trait i0 {
val I1 = new i0
val i4 = new {
def i4 = new i0
}