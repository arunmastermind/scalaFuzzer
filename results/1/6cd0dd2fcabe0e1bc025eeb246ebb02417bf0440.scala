trait i0[+i1 <: AnyRef] extends I2[i1] {
type I2
}
object I3 {
def i1[I3 <: i0](I4: i0[I2]): I3.I2(I5.I3) = I2
}
object I5 extends I2 {
def i6 = {
val I7: Nothing =
I7.I3(I4)
}
}