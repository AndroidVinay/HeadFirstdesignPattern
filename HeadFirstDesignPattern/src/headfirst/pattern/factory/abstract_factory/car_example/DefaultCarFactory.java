package headfirst.pattern.factory.abstract_factory.car_example;

public class DefaultCarFactory {

	public DefaultCarFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Car carBuilder(CarType model) {
		
		Car car =null;
		switch(model) {
		
		case MICRO:
			car =new MicroCar(Location.DEFAULT);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;
		case MINI:
			car = new MiniCar(Location.DEFAULT);
		}
		
		return car;
		
	}

}
