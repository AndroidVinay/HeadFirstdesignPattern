package headfirst.pattern.decorator.starbuzzwithsize;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+.30;
	}

}
