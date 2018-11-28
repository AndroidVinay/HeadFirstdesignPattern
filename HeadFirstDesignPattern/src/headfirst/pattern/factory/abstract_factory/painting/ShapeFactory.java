package headfirst.pattern.factory.abstract_factory.painting;

public class ShapeFactory extends Abstractfactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		Shape sh=null;
		
		if(shape.equalsIgnoreCase("Rectangle"))
			sh = new Rectangle();
		else if(shape.equalsIgnoreCase("Circle"))
			sh = new Circle();
		else if(shape.equalsIgnoreCase("Square"))
			sh = new Square();
		
		
		return sh;
	}
	

//	public static Shape getShape(String shape) {
//		Shape sh=null;
//		
//		if(shape.equalsIgnoreCase("Rectangle"))
//			sh = new Rectangle();
//		else if(shape.equalsIgnoreCase("Circle"))
//			sh = new Circle();
//		else if(shape.equalsIgnoreCase("Square"))
//			sh = new Square();
//		
//		
//		return sh;
//	}
	
}
