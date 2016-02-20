package traits_inheritance

/**
 * @author cclayt02
 */
sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(val radius: Double) extends Shape{
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

class Rectangular(val sideA: Double, val sideB: Double) extends Shape{
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

case class Rectangle(val side1: Double, val side2:Double) extends Rectangular(side1, side2){
   
  
}

case class Square(val side:Double) extends Rectangular(side, side){
   
  
}

object Draw extends App {
  def apply(shape: Shape) : String = shape match {
    case shape:Circle => "A circle of radius " + shape.radius + "cm"
    case shape:Rectangle => "A rectangle of width " + shape.sideA + "cm and height " + shape.sideB + "cm"
    case shape:Square => "A square of sides " + shape.side + "cm"
    //case shape:Rectangular => "cm"
  }
  
}

object ShapeTest extends App{
  val shape = new Square(4.4)
  println(shape.area)
    
}

object DrawTest extends App{
  val r1 = Draw(Circle(10))
  println(r1)
  val r2 = Draw(Rectangle(4,3))
  println(r2)
}