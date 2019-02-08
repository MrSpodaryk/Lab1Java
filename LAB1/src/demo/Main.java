package demo;

public class Main {

	public static void main(String[] args) {
		
		Laptop a1 = new Laptop();
		Laptop a2 = new Laptop(3.5, 8, "ASUS", 12);
		Laptop a3 = new Laptop(3.6, 16, "MacBook", 15, 47000, 30, 1.83);
		
		a1.to_string();
		a2.to_string();
		a3.to_string();
		
		Laptop.print_static​_number_of_monitors();
		a1.print_number_of_monitors();
	}

}
