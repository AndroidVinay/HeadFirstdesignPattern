package headfirst.pattern.factory.abstract_factory.car_example;

public class CarFactory {

	private CarFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Car carBuilder(CarType model,Location location) {
		
		
		//we can get location by GPS service, right now we are sending manual
		Car car=null;
		
		switch(location)
		{
		case	USA:
				car = USACarFactory.carBuilder(model);
			break;
		case	INDIA:
				car = IndianCarFactory.carBuilder(model);
				break;
		case	DEFAULT:
				car = DefaultCarFactory.carBuilder(model);
				break;
		}
		
		return car;
		
	}
	
	

}
