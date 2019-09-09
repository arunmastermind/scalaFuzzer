trait I0[@specialized(Boolean) I1] {
List(1).map {
case Some(I0) => sys.error();
}
}