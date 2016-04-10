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
  
  val v3 = Vector(1,2,3,4)
  //v3.foreach { x =>  x = (x*11) + 10} is Vector(21, 32, 43, 54)
  //doesn't work, you cant reassign as its now immutable. if you don't try to assign it
  //then it doesnt do anything with the computed value
  
  //1c
  val v4 = for (v <- v3) yield ((v *11) + 10)
  v4 is Vector(21, 32, 43, 54)
  
  
  //2
  val v5 = Vector(1, 2, 3, 4)
  v5.map(n => n + 1) is Vector(2, 3, 4, 5)
  
  val v6 = Vector(1, 2, 3, 4)
  val v7 = for (v <- v6) yield (v  + 1)
  
  val v8 = Vector(1, 10, 100, 1000)
  v8.reduce((sum, n) => sum + n) is 1111
  
  
  //3
  val v9 = Vector(1, 10, 100, 1000)
  var sum = 0
  for (v <- v9) sum += v
  sum is 1111
  
  
  //4
  
  def sumIt(nums: Integer*) : Int = {    
    nums.reduce((sum, n) => sum + n)
  }
  
  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195
  
  
}