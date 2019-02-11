package demo;

public class Main {

	public static void main(String[] args) {
		
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop(3.5, 8, "ASUS", 12);
		Laptop laptop3 = new Laptop(3.6, 16, "MacBook", 15, 47000, 30, 1.83);
		
	    System.out.println(laptop1.toString());
	    System.out.println(laptop2.toString());
	    System.out.println(laptop3.toString());

		Laptop.printStatic​NumberOfMonitors();
		laptop1.printNumberOfMonitors();
	}

}
