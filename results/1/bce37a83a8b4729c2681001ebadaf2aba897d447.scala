package I0
trait I1[+I1[_, Any]]
trait I1 extends I0[I1]
object I1 {
def i2[I1, I1 <: I1[i2]](implicit i2: I1[Int, i2)]: i2[i2] = i2
}
object i2 {
def i2(i2: I1[Int, Any]): this.type = i2
implicit val I1: i2.type = I1
val I1 = new i2.i2
(2)
}
}