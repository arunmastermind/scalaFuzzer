object App {
def I0 = {
val I0 = this
println(I0)
} yield I0 match {
case I1: Exception => {} }
}
}