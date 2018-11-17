package headfirst.pattern.decorator.starbuzz;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Milk";
	}

	@Override
	public double cost() {
		return beverage.cost()+.30;
	}

}
