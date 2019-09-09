trait I0[I0, I1]
trait I2 {
def I2[@specialized I0[_]]: Int => I2[I0] = ???
I0[this](I2).I2
}