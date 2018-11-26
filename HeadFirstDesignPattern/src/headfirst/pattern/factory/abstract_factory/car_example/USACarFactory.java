package headfirst.pattern.factory.abstract_factory.car_example;

public class USACarFactory {

	public USACarFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Car carBuilder(CarType model) {
		
		Car car =null;
		switch(model) {
		
		case MICRO:
			car =new MicroCar(Location.USA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;
		case MINI:
			car = new MiniCar(Location.USA);
		}
		
		return car;
		
	}

}
