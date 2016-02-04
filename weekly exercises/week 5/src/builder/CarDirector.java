package builder;

public class CarDirector {
	
	CarBuilder builder;
	
	public CarDirector(CarBuilder carBuilder){
		builder = carBuilder;
	}
	
	void build(){
		builder.buildBodyStyle(); 
		builder.buildPower();
		builder.buildEngine();
		builder.buildBreaks();
		builder.buildSeats();
		builder.buildWindows();
		builder.buildFuelType();
	}
}
