object I0 {
def i1(i2: Int => Int) = i2.map(this: Nil)
println(i1(i2.selectDynamic.i2)
}