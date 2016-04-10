package traits_inheritance

//5a, 5c, 5e
/**
 * @author cclayt02
 */
sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
  def colour: Colour
}

case class Circle(val radius: Double, val colour: Colour) extends Shape{
  def sides: Int = {
    1
  }
  
  def perimeter: Double = {
    2* math.Pi * radius
  }
  
  def area: Double = {
    math.Pi * radius * radius
  }
  
}

class Rectangular(val sideA: Double, val sideB: Double, val colour: Colour) extends Shape{
  def sides: Int = {
    4
  }
  
  def perimeter: Double = {
    (sideA * 2) + (sideB * 2)
  }
  
  def area: Double = {
    sideA * sideB
  }
}

//5b
case class Rectangle(val side1: Double, val side2:Double, val c: Colour) extends Rectangular(side1, side2, c){
   
  
}

case class Square(val side:Double, val c: Colour) extends Rectangular(side, side, c){
   
  
}

object Draw extends App {
  def apply(shape: Shape) : String = shape match {
    case shape:Circle => "A circle of radius " + shape.radius + "cm of a colour " + shape.colour.getName
    case shape:Rectangle => "A rectangle of width " + shape.sideA + "cm and height " + shape.sideB + "cm of a colour " + shape.colour.getName
    case shape:Square => "A square of sides " + shape.side + "cm of a colour " + shape.colour.getName
    //case shape:Rectangular => "cm"
  }
  
}

object ShapeTest extends App{
  val shape = new Square(4.4, new Pink)
  println(shape.area)
    
}

object DrawTest extends App{
  val r1 = Draw(Circle(10, new Yellow))
  println(r1)
  val r2 = Draw(Rectangle(4,3, new AnyColourYouLike(111, 54, 202)))
  println(r2)
}

// 5d)
sealed trait Colour {
  val Red: Int
  val Green: Int
  val Blue: Int
  
  val minVal: Int = 0
  val maxVal = 255
  
  def getBrightness: Int = {
    Red + Green + Blue
  }
  
  def isBright: Boolean = {
    getBrightness > (maxVal * 3 / 2)
  }
  
  def getName: String
}

class Red(val Red: Int = 255, 
    val Green: Int = 0, val Blue: Int = 0) extends Colour{
  def getName: String = {
      "Red"
  }
}

class Yellow(val Red: Int = 0, 
    val Green: Int = 255, val Blue: Int = 255) extends Colour{
  def getName: String = {
      "Yellow"
  }
}

case class Pink(val Red: Int = 130, 
    val Green: Int = 0, val Blue: Int = 0) extends Colour{
  def getName: String = {
      "Pink"
  }
}

case class AnyColourYouLike(val Red: Int, val Green: Int, val Blue: Int) extends Colour{
  
  def getName: String = {
    if(isBright)
      return "Bright"
    else
      return "Dark"
  }
}


object ColourTest extends App{
  val pink: Colour = new Pink
  println(pink.isBright)
  
  val yellow: Colour = new Yellow
  println(yellow.isBright)
  
  val any: Colour = new AnyColourYouLike(123, 67, 211)
  println(any.isBright)
}