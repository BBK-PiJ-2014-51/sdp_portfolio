package bridge;

public class GearLocking implements Product {
	private String name;
	
	public GearLocking(String name){
		this.name = name;
	}
	
	@Override
	public String getProductName() {
		return name;
	}
}
