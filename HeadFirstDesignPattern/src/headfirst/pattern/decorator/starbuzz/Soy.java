package headfirst.pattern.decorator.starbuzz;

public class Soy extends CondimentDecorator {



	public Soy(Beverage beverage) {
		super(beverage);
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
