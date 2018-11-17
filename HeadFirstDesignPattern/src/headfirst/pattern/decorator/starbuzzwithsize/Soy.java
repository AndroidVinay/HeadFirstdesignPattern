package headfirst.pattern.decorator.starbuzzwithsize;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Soy";
	}

	@Override
	public double cost() {
		return beverage.cost()+.40;
	}

}
