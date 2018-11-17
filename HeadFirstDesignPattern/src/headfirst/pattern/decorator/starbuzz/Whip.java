package headfirst.pattern.decorator.starbuzz;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
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
