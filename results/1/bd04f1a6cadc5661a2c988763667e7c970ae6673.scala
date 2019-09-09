object I0 {
def I1[I1](I2: ClassTag[I1[_])](I2: List[I1]) = I1
def I2[I2 <: Singleton](I3: I2): I0[({ type I2[I1] = I2[I2] })#I2] = {
I3(new I1[Int, String].asInstanceOf[Symbol]]
I1(List(1, I1 + _))
}
}