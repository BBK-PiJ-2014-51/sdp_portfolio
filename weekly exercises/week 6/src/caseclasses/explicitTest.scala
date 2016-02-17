package caseclasses
import com.atomicscala.AtomicTest._


object explicitTest extends App{
  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  // Explicit return type:
  def explicit(c1: Char, c2: Char, c3: Char):
    Vector[Char] = {
    Vector(c1, c2, c3)
  }
  
  
  def explicitList(vec: Vector[Double]):
    List[Double] = {
        var list List()
        for (i <- 1 to vec.length){
           list = List:::list(vec(i))  
        }
  }
  
  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicit('a', 'b', 'c') is "Vector(a, b, c)"
  
  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
  
}