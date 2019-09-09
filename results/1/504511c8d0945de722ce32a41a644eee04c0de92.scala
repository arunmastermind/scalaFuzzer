trait I0[I0[_], I0]
trait i1[@specialized(Int) I0](I0 << I2 ) extends I0[I0]
def I2[I0[_[_]]](i1: I0[I0]): i1[I0[I0]][null] =
def I0 = i1(new i1)
}