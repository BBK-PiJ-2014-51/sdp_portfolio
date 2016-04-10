

/**
 * @author cclayt02
 */
object Expressions extends App{
  val sky = "sunny"
  val temperature = 80
  
  val Expression1: Boolean = if (sky == "sunny" && temperature > 80) true else false
  val Expression2: Boolean = if ((sky == "sunny" || sky == "partly cloudy") && temperature > 80) true else false 
  val Expression3: Boolean = if ((sky == "sunny" || sky == "partly cloudy") && (temperature > 80 || temperature < 20)) true else false
  
  val temp = 50.0f
  
  val cToF: Float = temp * 9 / 5.0f + 32
  println(cToF)
  
  val fToC: Float = (temp - 32) * 5 / 9.0f
  println(fToC)
  
}