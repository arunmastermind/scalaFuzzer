object i0 {
def i0[@specialized(Int) I1](I1: I1) = 0
I1 = 9
}
{
def i0: Int = I1()
}