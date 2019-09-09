class I0(I1: AnyRef) {
def I2: Int = 1
}
abstract class I2() {
val i3 = new I0();
val i3 = i3.I2; new I2.i3();
}