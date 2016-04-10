package decorator;

public class Ham extends PizzaDecorator {
	
	private String desc = "Ham";
	private double price = 18.12;
	
	
	public Ham(Pizza pizza) {
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
