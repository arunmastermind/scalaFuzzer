object i0 {
class i0
}
class i0[i1 <: i0]
object i1 {
implicit def i2[I3](i4: i1[i0]) = i1 match {
case i2: i0 => i1.i2
case _ => throw new i1()
}
}