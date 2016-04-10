package decorator;

public class Cheese extends PizzaDecorator {
	
	private String desc = "Cheese";
	private double price = 20.72;
	
	
	public Cheese(Pizza pizza) {
		super(pizza);
	}
	
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", " + this.desc + " (" + Double.toString(price)+")";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + this.price;
	}
}
