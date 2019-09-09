object i0 {
def i1: i0 = 1.0
def i1(i2: Any = 2)
println(i0.i1(2)) map {
println( + i2)
}
}