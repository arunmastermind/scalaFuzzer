object I0 {
class I1
def I2(I3: I1): Int = 123
def I4 = (I2: Int) => I1;
}
import I0.{ I3 => String, _: Int, I4 @_*, I3(_, _*) } }