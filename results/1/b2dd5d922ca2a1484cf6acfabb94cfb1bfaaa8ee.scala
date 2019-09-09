object I0 {
def I1[i2[_]](i3: i2)(implicit i3: I0[I1, i2], I4: i2): i2[I1] = sys.error("")
}
object I4 {
implicit val I4: I0[String] = new {
def I4[i3]: Any = Some(i3.I4)
}