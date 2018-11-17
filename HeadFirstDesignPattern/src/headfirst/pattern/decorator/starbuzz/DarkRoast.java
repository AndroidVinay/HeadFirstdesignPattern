package headfirst.pattern.decorator.starbuzz;

public class DarkRoast extends Beverage
{
	public DarkRoast() {
		description =" Dark roasted coffee";
	}
	

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
