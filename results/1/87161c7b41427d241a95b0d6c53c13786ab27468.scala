class I0 {
def I0[I0, I1 <: I1[I0], I1](I1: => Any): String
protected _
case class I1[I1, +I1 <: I1[I1] <: I0[I1, I1]](I1: String)
case class I1[I0](erased val I1: I0[I0]) extends I0[I0]
object I0 {
def I0(I1: Any) = I0 map I1"
val I0 = new I1(new I0.I1().I0[List[Option]] sealed map { case I1[_] => I0 }
}
object I0 {
def I1[I0, I1](implicit I0: I1[I0]): I1[I0, Int] = 1 }