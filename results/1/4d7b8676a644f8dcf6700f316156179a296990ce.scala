class i0[i1]
class I2[i1] extends List[Int, Nothing] {
def toArray = this
}
object I3 {
def i4[i1]: i0[I2] = new i0(I3)
def unapply(i4: Any) = new i0[Boolean](i4)
}