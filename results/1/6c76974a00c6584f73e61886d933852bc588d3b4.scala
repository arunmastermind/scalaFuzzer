class I0 {
def i1 = 2;
def i1(): i1;
def I2 = new I0();
val i3 = i1.I2;
val i3: i1 = I0.I2();
val i3: I0 = i1;
}