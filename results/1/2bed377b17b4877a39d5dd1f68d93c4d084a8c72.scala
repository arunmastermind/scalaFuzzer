object i0 {
class I1
def I1(I2: I1): Int = 123
def I3 = (I1: Int) => I1;
}
import i0.{ I2 => String, _: Int, I3 @_*, I2(_, _*) } }