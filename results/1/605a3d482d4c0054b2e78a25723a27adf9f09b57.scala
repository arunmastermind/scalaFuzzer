trait I0 {
type I0
type I1
type I1[I1 <: I1[I1], I2, I2 <: I2[I1]]
def next: I1[I1, I1] = sys.error()
implicit val I2: I1[I1] = Nil
}