package generics

sealed trait LinkedList[T] {
  
  def length: Int = 
  this match {
    case End() => 0
    case Pair(head, tail) => 1 + tail.length
  }
  
  def contains(num: T): Boolean =
   this match {
    case End() => false
    case Pair(head, tail) => {
        num == head || tail.contains(num)
    }
  }
  
  def apply(index: Int): T = {
    
    this match{
      case End() => throw new Exception()
      case Pair(head, tail) =>{
        if(index == 0)
          return head
        else
          return tail.apply(index - 1)        
      }
    }
    
  }
      
}

final case class End[T]() extends LinkedList[T]

final case class Pair[T](head: T, tail: LinkedList[T]) extends LinkedList[T]

object GenericsTest extends App{
  val example = Pair(1, Pair(2, Pair(3, End())))
  assert(example.length == 3)
  assert(example.tail.length == 2)
  assert(End().length == 0)
  
  val example2 = Pair(1, Pair(2, Pair(3, End())))
  assert(example2.contains(3) == true)
  assert(example2.contains(4) == false)
  assert(End().contains(0) == false)
  
  val example3 = Pair(1, Pair(2, Pair(3, End())))
  assert(example3(0) == 1)
  assert(example3(1) == 2)
  assert(example3(2) == 3)
  assert(try {
    example3(3)
    false
  } catch {
    case e: Exception => true
  })
}