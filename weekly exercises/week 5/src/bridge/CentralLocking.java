package bridge;

public class CentralLocking implements Product {

	private String name;
	
	public CentralLocking(String name){
		this.name = name;
	}
	
	@Override
	public String getProductName() {
		return name;
	}

}
