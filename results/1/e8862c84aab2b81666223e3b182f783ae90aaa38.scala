object I0 {
class I1[I2]
implicit def I2[I2]: implicit I2[I1] =
({ false; implicitly[Int, Int] })#I2[String] }