package headfirst.pattern.factory.computer_example;

public class PC extends Computer {
	
	private String ram;
	private String cpu;
	private String hdd;



	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
