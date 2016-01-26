package decorator;

public abstract class PizzaDecorator implements Pizza {

	String desc;
	double price;
	
	public PizzaDecorator(Pizza pizza){

	}
	
	@Override
	public String getDesc() {
		return desc;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
