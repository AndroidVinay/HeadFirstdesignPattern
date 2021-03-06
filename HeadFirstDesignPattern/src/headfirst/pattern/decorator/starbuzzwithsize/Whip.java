package headfirst.pattern.decorator.starbuzzwithsize;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+.50;
	}

}
