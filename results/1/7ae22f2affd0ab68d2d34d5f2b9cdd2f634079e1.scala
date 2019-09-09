object I0 {
def I0[I1[_]](I2: I1)(implicit I2: I0[I0, I1], i3: I1): I1[I0] = sys.error("")
}
object i3 {
implicit val i4: I0[String] = new {
def i4[I2]: Any = Some(I2.i4)
}