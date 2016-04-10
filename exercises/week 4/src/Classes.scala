
import com.atomicscala.AtomicTest._

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


object FieldsInClasses extends App{
    
  class Cup {
      var percentFull = 0
      val max = 100
      def add(increase:Int):Int = {
        percentFull += increase
        if(percentFull > max) {
          percentFull = max
        }
        percentFull // Return this value
      }
    }
  
    val cup = new Cup
    cup.add(45) is 45
    cup.add(-15) is 30
    cup.add(-50) is -20
    
    class Cup2 {
      var percentFull = 0
      val max = 100
      def add(increase:Int):Int = {
        percentFull += increase
        if(percentFull > max) {
          percentFull = max
        }else if(percentFull < 0){
          percentFull = 0
        }
        percentFull // Return this value
      }
    }
    
    val cup2 = new Cup2
    cup2.add(45) is 45
    cup2.add(-55) is 0
    cup2.add(10) is 10
    cup2.add(-9) is 1
    cup2.add(-2) is 0
    
    cup.percentFull = 56
    cup.percentFull is 56
    
    
    class Cup3 {
      var percentFull = 0
      val max = 100
      def add(increase:Int):Int = {
        percentFull += increase
        if(percentFull > max) {
          percentFull = max
        }
        percentFull // Return this value
      }
      
      def set(p:Int) = {
        percentFull = p
      }
      
      def get(): Int = {
        return percentFull
      }
    }
    
    val cup3 = new Cup3
    cup3.set(56)
    cup3.get() is 56
    
    
  
}