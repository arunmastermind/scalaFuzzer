object App {
def i0 = {
val i0 = this
println(i0)
} yield i0 match {
case i1: Exception => {} }
}
}