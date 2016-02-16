package arguments
import com.atomicscala.AtomicTest._

class Planet(name: String, description: String, moons: Int) {

  
  def hasMoon: Boolean = {
      moons > 0
  }
  
  
}

object PlanetTest extends App{
  
  val p = new Planet(name = "Mercury",
  description = "small and hot planet", moons = 0)
  p.hasMoon is false
  
  val earth = new Planet(moons = 1, name = "Earth",
  description = "a hospitable planet")
  earth.hasMoon is true
}