trait I0 {
def i1: Double
}
trait i2 {
def i2((4: Int) => Unit): Option[I0] = this
}
case class i3(I0: I0) {
def i3(i2: Int, i3: Int) = i2 * i3
def i3=(i3: Int) = i3 = i2(i3 with I0)
}