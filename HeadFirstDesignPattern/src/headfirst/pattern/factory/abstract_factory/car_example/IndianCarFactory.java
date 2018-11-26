package headfirst.pattern.factory.abstract_factory.car_example;

public class IndianCarFactory {

	public IndianCarFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Car carBuilder(CarType model) {
		
		Car car =null;
		switch(model) {
		
		case MICRO:
			car =new MicroCar(Location.INDIA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.INDIA);
			break;
		case MINI:
			car = new MiniCar(Location.INDIA);
		}
		
		return car;
		
	}

}
