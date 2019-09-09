trait I0 {
type I1
type I2 <: I1
val i3: I2
def i3: I1
val i4: I2
def i4: I0 = this <
I2
}