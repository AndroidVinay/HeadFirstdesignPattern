package headfirst.pattern.decorator.starbuzzwithsize;

public class DarkRoast extends Beverage
{
	public DarkRoast() {
		description =" Dark roasted coffee";
	}
	

	@Override
	public double cost() {

		if(size == size.TALL) {
			return 1.20;			
		}else if(size == size.GRANDE) {
			return 0.99;
		}else if(size == size.VENTI) {
			return 0.60;
		}
return 0;
	}

}
