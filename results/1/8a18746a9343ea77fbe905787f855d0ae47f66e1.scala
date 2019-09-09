class i0[I1]
class I2[I1] extends List[Int, Nothing] {
def toArray = this
}
object I3 {
def i4[I1]: i0[I2] = new i0(I3)
def unapply(i4: Any) = new i0[Boolean](i4)
}