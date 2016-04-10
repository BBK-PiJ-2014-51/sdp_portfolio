package decorator;

public class Meat extends PizzaDecorator {

	
	private String desc = "Meat";
	private double price = 14.25;
	
	
	public Meat(Pizza pizza) {
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
