package headfirst.pattern.factory.abstract_factory.painting;

public class ColorFactory extends Abstractfactory{

	@Override
	Color getColor(String color) {
		Color col=null;
		if(color.equalsIgnoreCase("Red"))
			col = new Red();
		else if(color.equalsIgnoreCase("Blue"))
			col = new Blue();
		return col;
	}

	@Override
	Shape getShape(String shape) {

		return null;
	}
	
//	public static Color getColor(String color) {
//		
//		Color col=null;
//		
//		if(color.equalsIgnoreCase("Red"))
//			col = new Red();
//		else if(color.equalsIgnoreCase("Blue"))
//			col = new Blue();
//		return col;
//		
//	}
}
