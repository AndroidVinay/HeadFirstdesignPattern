package headfirst.pattern.factory.abstract_factory.car_example;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		// TODO Auto-generated constructor stub
construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Micro car");

	}

}
