package map_reduce
import com.atomicscala.AtomicTest._

/**
 * @author cclayt02
 */
object Map extends App{
  
  //1a
  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)
  
  val v2 = Vector(1, 2, 3, 4)
  v2.map(x => (x*11) + 10) is Vector(21, 32, 43, 54)
  
  //1b
  
  var v3 = Vector(1,2,3,4)
  //v3.foreach { x =>  x = (x*11) + 10} is Vector(21, 32, 43, 54)
  //doesn't work, you cant reassign as its now immutable. if you don't try to assign it
  //then it doesnt do anything with the computed value
  
  //1c
  var v4 = for (v <- v3) yield ((v *11) + 10)
  v4 is Vector(21, 32, 43, 54)
}