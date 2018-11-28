package headfirst.pattern.factory.abstract_factory.painting;

public class FactoryDemoMain {

		public static void main(String[] args) {
			
			Abstractfactory fac = FactoryProducer.getFactory("Shape");
			
			Shape shape = fac.getShape("Rectangle");
			
			
			Abstractfactory colorfac = FactoryProducer.getFactory("Color");
			
			Color col= colorfac.getColor("blue");
			
			shape.draw();
			col.fill();
			
		}
}
