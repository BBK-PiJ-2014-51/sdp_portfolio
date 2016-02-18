package traits_inheritance

/**
 * @author cclayt02
 */
trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

class Circle(val radius: Double) extends Shape{
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

class Rectangle(val sideA: Double, val sideB: Double) extends Shape{
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

class Square(val side:Double) extends Rectangle(side, side){}


object ShapeTest extends App{
  val shape = new Square(4.4)
  println(shape.area)
    
}