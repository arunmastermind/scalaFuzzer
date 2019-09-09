class I0[I1[+i2]] {
def I3[I4 <: I3[I4 <: I1[I4]]](I4: I4[I5]): I3[I4]
}
object I5 {
implicit def I6[I4[_]](I4: I5): I4[i2] = sys.error("")
println(I4 > 5)
assert(I4 == 0).toArray
}
I6.I5
}