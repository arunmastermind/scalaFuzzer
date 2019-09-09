trait I0 { type i1[I2] }
trait I2 { I3: I0 =>
type i1[I2] = i1[I2]
}
val I3 = new I3
final case class I4[I4 <: I0](val i1: I4) extends i1 {
abstract override def i1(I2: Seq[_]) = I4(null, null)
}