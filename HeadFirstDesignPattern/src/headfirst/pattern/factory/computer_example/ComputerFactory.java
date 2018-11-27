package headfirst.pattern.factory.computer_example;

public class ComputerFactory {

	public static Computer getComputerFactory(String type,String ram, String hdd, String cpu) {
		
		if(type.equalsIgnoreCase("PC")) return new PC(ram,hdd,cpu);
		else if(type.equalsIgnoreCase("Server")) return new Server(ram,hdd,cpu);
		return null;
		
		
	}

}
