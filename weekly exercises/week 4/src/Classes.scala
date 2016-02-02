

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


object Classes extends App{
class Hippo(){}
val h = new Hippo()
class Lion(){}
var l = new Lion()
class Tiger(){}
var t = new Tiger()
class Monkey(){}
var m = new Monkey()
class Giraffe(){}
var g = new Giraffe()

println(h)
println(l)
println(t)
println(m)
println(g)

var l2 = new Lion()
var g2 = new Giraffe()
var g3 = new Giraffe()
println(l2)
println(g2)
println(g3)

}
