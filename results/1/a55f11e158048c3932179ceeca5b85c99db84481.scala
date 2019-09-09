object I0 {
def I0[I1](I1: Int) = I1
def I2[I1 <: I0](i3: I2) = i3 match {
case I0(_, I1) => true
}
def i4(implicit i3: I0[Int]) = i4 match {
case None => return I5.toList
println(i3 + i4)
}
}