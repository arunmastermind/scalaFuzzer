trait I0 { val I0: Int => Unit }
implicit def I0(I1: I0) = {
I0()
}