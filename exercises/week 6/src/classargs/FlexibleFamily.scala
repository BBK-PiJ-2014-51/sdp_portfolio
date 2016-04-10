package classargs

/**
 * @author cclayt02
 */
class FlexibleFamily(mother: String, father: String, family: String*) {
  
  def familySize(): Int = {
     family.size + 2
  }
}