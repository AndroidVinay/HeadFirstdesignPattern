package headfirst.pattern.decorator.starbuzzwithsize;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	
	public  Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return "Mocha";
	}

	public double cost() {
		if(beverage.getSize() == size.TALL) {
			return .20+beverage.cost();			
		}else if(beverage.getSize() == size.GRANDE) {
			return 0.15+beverage.cost();
		}else if(beverage.getSize() == size.VENTI) {
			return 0.10+beverage.cost();
		}
return 0;	}

}
