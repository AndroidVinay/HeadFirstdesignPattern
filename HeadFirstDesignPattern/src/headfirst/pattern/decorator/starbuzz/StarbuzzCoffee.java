package headfirst.pattern.decorator.starbuzz;

public class StarbuzzCoffee  {

	public static void main(String[] args) {
	
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Milk(beverage2);
		beverage2= new Milk(beverage2);
		System.out.println(beverage2.getDescription()+" "+"$"+beverage2.cost());
	}
	
}
