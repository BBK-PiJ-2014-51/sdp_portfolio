package arguments
import com.atomicscala.AtomicTest._

/**
 * @author cclayt02
 */
class SimpleTime(val hours: Int, val minutes: Int) {
  
  
}


object TestRunner extends App{
  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30
}