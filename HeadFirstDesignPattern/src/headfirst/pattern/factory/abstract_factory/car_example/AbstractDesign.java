package headfirst.pattern.factory.abstract_factory.car_example;

public class AbstractDesign {


	public static void main(String[] args) {
		
		System.out.println(CarFactory.carBuilder(CarType.MICRO, Location.INDIA));
		
	}
}
