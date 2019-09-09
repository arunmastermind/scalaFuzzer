object I0 extends App {
implicit def I0(I1: Int): I1.type = null
}
Console.println(I0(1))
}