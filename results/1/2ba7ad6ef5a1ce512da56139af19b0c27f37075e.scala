import I0.I0
trait I0 {
implicit val i1: I0
val i2: I0.this.I0 = this
}