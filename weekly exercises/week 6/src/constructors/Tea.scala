package constructors
import com.atomicscala.AtomicTest._

class Tea(name: String = "Earl Grey", decaf: Boolean = false, milk: Boolean = false,
    sugar: Boolean = false) {
  
  def describe(): String = {
    var desc = name
    if(decaf)
      desc += " decaf"
    if(milk)
      desc += " + milk"
     if(sugar)
      desc += " + sugar"
      
     desc
  }
  
  def calories(): Int = {
    var numCals = 0
    if (milk) 
      numCals += 100
    if(sugar)
      numCals += 16
     
      numCals
    
  }
  
}


object TeaTest extends App{
    val tea = new Tea
    tea.describe is "Earl Grey"
    tea.calories is 0
    val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
    lemonZinger.describe is "Lemon Zinger decaf"
    lemonZinger.calories is 0
    val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
    sweetGreen.describe is "Jasmine Green + sugar"
    sweetGreen.calories is 16
    val teaLatte = new Tea(sugar=true, milk=true)
    teaLatte.describe is "Earl Grey + milk + sugar"
    teaLatte.calories is 116
  
}