package decorator;

public class RomaTomatoes extends PizzaDecorator {

	private String desc = "Roma Tomatoes";
	private double price = 5.20;
	
	public RomaTomatoes(Pizza pizza) {
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
