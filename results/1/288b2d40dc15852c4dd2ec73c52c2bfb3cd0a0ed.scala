object i0 {
def i1: Unit =
I3 match {
case 3 => Some(I3, I3)
}
}
}
package scala.language.I3
object I3 {
trait I3
trait I4
case class I4()
case object I4
}
class i2 extends i0[String] {
override val i1 = App
}