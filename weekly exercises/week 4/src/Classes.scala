

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
  //creating classes
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

object CreatingClasses extends App{
  
  class Sailboat{
    def raise() : String = {
      val str = "Sails raised"
      println(str)
      return str
    }
    
    def lower(): String = {
      val str = "Sails lowered"
      println(str)
      return str
    }
  }
  
  class Motorboat{
    def on() : String = {
      val str = "Motor on"
      println(str)
      return str
    }
    
    def off(): String = {
      val str = "Motor off"
      println(str)
      return str
    }
  }
  
val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)

val motorboat = new Motorboat
val s1 = motorboat.on()
assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
val s2 = motorboat.off()
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
  
  class Flare{
  
    def light() : String = {
        val str ="Flare used!"
        println(str)
        return str
    }
  
  }

  class Sailboat2 extends Sailboat{
    val f = new Flare
    
    def signal(): String = {
      return f.light
    }
  }
  
  class Motorboat2 extends Motorboat{
    val f = new Flare
    
    def signal(): String = {
      return f.light
    }
    
  }

val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)


}
