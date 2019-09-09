object i0 {
def i0[I1](I1: Int) = I1
def I2[I1 <: i0](I3: I2) = I3 match {
case i0(_, I1) => true
}
def I3(implicit I3: i0[Int]) = I3 match {
case None => return I4.toList
println(I3 + I3)
}
}