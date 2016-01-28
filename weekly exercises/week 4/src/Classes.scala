

/**
 * @author cclayt02
 */
object Range extends App{
 
  val r1 = 1 to 10
  println(r1.step)
  val r2 = 1 to 10 by 2
  println(r2.step)
  //difference is the interval when traversing the range
  
}

object StringsEqual extends App{
  var s1 = "Sally"
  var s2 = "Sally"
  
  println(if(s1.equals(s2)) "Equal" else "not equal")
  
}