package Problems;

public class Computer {
	public class Processor{
		String brand;
		int speed;
		
		Processor(String brand, int speed){
			this.brand = brand;
			this.speed = speed;
		}
		
		void displayDetails() {
			System.out.println("Brand :"+brand);
			System.out.println("Speed : "+speed);
		}
	}
	public static void main(String[]args) {
		Computer c = new Computer();
		Computer.Processor p = c.new Processor("Intel",3);
		
		p.displayDetails();
	}
}
