object I0 {
def I0: I0 = 1.0
def I0(I1: Any = 2)
println(I0.I0(2)) map {
println( + I1)
}
}