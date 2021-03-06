package decorator;

public class GreenOlives extends PizzaDecorator {

	private String desc = "Green Olives";
	private double price = 5.47;
	
	public GreenOlives(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
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