package headfirst.pattern.decorator.starbuzzwithsize;

public abstract class Beverage {
	
	public enum Size  {TALL,GRANDE,VENTI};

	Size size = Size.TALL;
	String description="unknown beverage";
	
	
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public abstract double cost();
}
