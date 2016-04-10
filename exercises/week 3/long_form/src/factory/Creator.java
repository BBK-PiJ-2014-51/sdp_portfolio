package factory;

public abstract class Creator {

	
	public Product createProduct(){
		return new ConcreteProduct();
	}
}
