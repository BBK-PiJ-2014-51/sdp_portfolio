package decorator;

public class Spinach extends PizzaDecorator {

	private String desc = "Spinach";
	private double price = 7.92;
	
	public Spinach(Pizza pizza) {
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
