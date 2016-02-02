
import com.atomicscala.AtomicTest._

object Vectors extends App{
  val Vec1 = Vector(1,2,3)
  val Vec2 = Vector("a", "b", "c")
  val Vec3 = Vector(true, false, true)
  
  val vecVec = Vector(Vector(1),Vector(2),Vector(3))
  
  var sentence = ""
  val strVec = Vector("The","dog","visited","the","fire","station");
  
  for (word <- strVec)
      sentence += word + " "
  
   println(sentence)
   sentence.toString() is "The dog visited the fire station "
   
   val intVec = Vector(21,32,43)
   val dVec = Vector(123.21,13.2,4.3323)
   
   println(intVec.sum)
   println(intVec.min)
   println(intVec.max)
   
   println(dVec.sum)
   println(dVec.min)
   println(dVec.max)
   
   val myVector1 = Vector(1,2,3,4,5,6)
   val myVector2 = Vector(1,2,3,4,5,6)
   
   myVector1 is myVector2
   
  println("Finished execution")
}