package classargs

/**
 * @author cclayt02
 */
class Family(family: String*) {
  
  def familySize(): Int = {
     family.size
  }
}