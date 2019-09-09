object I0 extends App {
implicit def I0(i1: Int): i1.type = null
}
Console.println(I0(1))
}