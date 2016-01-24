package factory;

public class ConcreteCreator extends Creator {

	@Override
	public Product createProduct(){
		return createConcreteProduct();
	}
	
	public Product createConcreteProduct(){
		return new ConcreteProduct();
	}
}
