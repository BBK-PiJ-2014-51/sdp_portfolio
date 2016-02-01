package decorator;

public abstract class PizzaDecorator implements Pizza {

	protected Pizza pizza;
	
	public PizzaDecorator(Pizza pizza){
		
		this.pizza = pizza;

	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc();
	}

	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

}
