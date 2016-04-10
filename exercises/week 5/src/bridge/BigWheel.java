package bridge;

public class BigWheel implements Car {
	
	private Product product;
	private String carName;

	public BigWheel(Product product, String carName) {
		this.product = product;
		this.carName = carName;
	}

	@Override
	public void produceProduct() {
		System.out.println("Producing " + product.getProductName());
		System.out.println("Modifying product " + product.getProductName()
				+ "according to " + carName);
	}

	@Override
	public void assemble() {
		System.out.println("Assembling " + product.getProductName() + " for " + carName);
	}

	@Override
	public void printDetails() {
		System.out.println("Car: " + carName + ", Product:" + product.getProductName());
		
	}

}
