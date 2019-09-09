object App {
def I0 = {
val I1 = this
println(I1)
} yield I0 match {
case I2: Exception => {} }
}
}