package headfirst.pattern.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

	

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return "Mocha";
	}

	public double cost() {
		return .20+ beverage.cost();
	}

}
