package constructors

class ClothesWasher(modelName: String = "def_name", capacity: Double = 0.2d) {
  def this(name:String){
    this(modelName = name)
  }
  def this(cap: Double){
    this(capacity = cap)
  }
}

class ClothesWasher2(modelName: String = "def_name", capacity: Double = 0.2d) {
  
}

class ClothesWasher3(modelName: String = "def_name", capacity: Double = 0.2d) {
  def this(name:String){
    1 + 2 //this won't compile
    this(modelName = name)
  }
  def this(cap: Double){
    this(capacity = cap)
    1+2 // this will compile
  }
}