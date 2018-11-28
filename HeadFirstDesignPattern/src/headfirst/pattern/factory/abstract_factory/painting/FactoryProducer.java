package headfirst.pattern.factory.abstract_factory.painting;

public class FactoryProducer {
	
	public static Abstractfactory getFactory(String factory) {
			Abstractfactory  abstractfac= null;
		
			if(factory.equalsIgnoreCase("shape"))
				abstractfac = new ShapeFactory();
			else if(factory.equalsIgnoreCase("Color"))
				abstractfac = new ColorFactory();
		return abstractfac;
		
	}

}
