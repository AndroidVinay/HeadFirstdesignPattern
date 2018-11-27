package headfirst.pattern.factory.computer_example;

public class TestFactory {

	public TestFactory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputerFactory("PC", "4GB", "200GB", "intel 3.4 ghz");
		Computer server = ComputerFactory.getComputerFactory("Server", "24gb", "1TB", "intel 6 ghz");
		
		System.out.println("PC config "+pc.toString());
		System.out.println("SERVER config "+server.toString());
	}

}
