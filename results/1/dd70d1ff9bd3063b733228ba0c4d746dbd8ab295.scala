object I0 {
def i1(i2: I0): Int = 0
i1 match {
case _: String => None
case _ => i2
}
def i2(i3: String): I0 = null
i3
}
class i4 {
implicit class i1(i2: Int)
val i2: Int = {
this: Option[Object]
}
}