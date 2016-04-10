package decorator;

public class SimplyVegPizza implements Pizza{

	private String desc = "SimplyVegPizza";
	private double price = 230;
	
	@Override
	public String getDesc() {
		return desc + " (" + Double.toString(price)
				+ ")";
	}

	@Override
	public double getPrice() {
		return price;
	}

}
