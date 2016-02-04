package builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		carBuilder = new SportsCarBuilder();
		director = new CarDirector(carBuilder);
		director.build();
		car = carBuilder.getCar();
		System.out.println(car);
	}
	
	
	/* expected output:
		--------------SEDAN---------------------
		Body: External dimensions: overall length (inches): 202.9,
		overall width (inches): 76.2, overall height (inches): 60.7,
		wheelbase (inches): 112.9, front track (inches): 65.3,
		rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5
		Power: 285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm
		Engine: 3.5L Duramax V 6 DOHC
		Breaks: Four-wheel disc brakes: two ventilated. Electronic brake distribution
		Seats: Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats
		Windows: Laminated side windows.Fixed rear window with defroster
		Fuel Type: Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range
		--------------SPORTS---------------------
		Body: External dimensions: overall length (inches): 192.3,
		overall width (inches): 75.5, overall height (inches): 54.2,
		wheelbase (inches): 112.3, front track (inches): 63.7,
		rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7
		Power: 323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm
		Engine: 3.6L V 6 DOHC and variable valve timing
		Breaks: Four-wheel disc brakes: two ventilated. Electronic brake distribution.
		Stability control
		Seats: Driver sports front seat with one power adjustments manual height,
		front passenger seat sports front seat with one power adjustments
		Windows: Front windows with one-touch on two windows
		Fuel Type: Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range	 
	 */

}
