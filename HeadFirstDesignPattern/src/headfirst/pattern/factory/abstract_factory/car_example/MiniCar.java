package headfirst.pattern.factory.abstract_factory.car_example;

public class MiniCar extends Car {

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		// TODO Auto-generated constructor stub
		construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Mini car");

	}

}
