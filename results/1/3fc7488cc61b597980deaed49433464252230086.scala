object I0 {
type I1[I1] = Array[I2 with I1]
}
trait I2 {
import I0.I2._
import I2._
import I1.{ Double => false }
}