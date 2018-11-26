package headfirst.pattern.factory.abstract_factory.car_example;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to luxury car");
	}

}
