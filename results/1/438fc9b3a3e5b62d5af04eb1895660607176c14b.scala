object i0 {
implicit def i0[I1, I2 <: i0](I2: I2) = {
val I1: ((I1), i0) = I1 || I2
()
}
}