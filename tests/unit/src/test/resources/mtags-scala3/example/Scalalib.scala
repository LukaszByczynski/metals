package example

class Scalalib/*example.Scalalib#*/ {
  val nil/*example.Scalalib#nil.*/ = List()
  val lst/*example.Scalalib#lst.*/ = List[
    (
        Nothing,
        Null,
        Singleton,
        Any,
        AnyRef,
        AnyVal,
        Int,
        Short,
        Double,
        Float,
        Char,
    )
  ](null)
  lst.isInstanceOf[Any]
  lst.asInstanceOf[Any]
  println(lst.##)
  lst ne lst
  lst eq lst
  lst == lst
}