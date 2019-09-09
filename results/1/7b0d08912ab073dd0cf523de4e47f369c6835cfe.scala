object I0 {
def I0[i1](i1: Int) = i1
def i1[i1 <: I0](i2: i1) = i2 match {
case I0(_, i1) => true
}
def i2(implicit i2: I0[Int]) = i2 match {
case None => return i2.toList
println(i2 + i2)
}
}