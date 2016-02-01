package decorator;

public class SimplyNonVegPizza implements Pizza {

	private String desc = "SimplyNonVegPizza";
	private double price = 350;
	
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
