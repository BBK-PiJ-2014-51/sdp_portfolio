

/**
 * @author cclayt02
 */
object Methods extends App{
  
  
  def getSquare(x: Int): Int = {
      return x * x
  }
  
  val a = getSquare(3)
  assert(a == 9)
  
  val b = getSquare(6)
  assert(b == 36)
  
  val c = getSquare(5)
  assert(c == 25)
  
  
  
  def isArg1GreaterThanArg2(x1: Double, x2: Double): Boolean = {
    return if(x1 > x2) true else false
  }
  
  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  assert(t1 == false)
  
  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2 == true)
    
  def manyTimesString(str: String, itrs: Int): String = {
    var i = 0
    var newStr: String = str
    
    for(i <- 1 until itrs){
        newStr = newStr + str
    }
    
    return newStr
  }
  
  val m1 = manyTimesString("abc", 3)
  assert("abcabcabc" == m1, "Your message here")
  
  val m2 = manyTimesString("123", 2)
  assert("123123" == m2, "Your message here")
  
}