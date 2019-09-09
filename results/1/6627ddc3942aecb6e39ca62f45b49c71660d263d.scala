class I0[i1 <: I0[i1]]
object I0 {
implicit def i1[I2, i3](I4: I2): I2(i3) = I4(i3) }
object i5 {
(new I0)[Int]
}