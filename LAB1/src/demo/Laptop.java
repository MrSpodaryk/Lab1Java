package demo;

public class Laptop {
	
private double speed_of_CPU;
private double capacity_of_RAM;
private String name;
private double size_of_display;
private double price;	

protected int number;
protected double weight;

static int number_of_monitors = 1;

public void set_speed_of_CPU(double speed) {
	this.speed_of_CPU = speed;
}
public double get_speed_of_CPU() {
	return speed_of_CPU;
}

public void set_capacity_of_RAM(double capacity) {
	this.capacity_of_RAM = capacity;
}
public double get_capacity_of_RAM() {
	return capacity_of_RAM;
}

public void set_name(String name) {
	this.name = name;
}
public String get_name() {
	return name;
}

public void set_size_of_display(double size) {
	this.size_of_display = size;
}
public double get_size_of_display() {
	return size_of_display;
}

public void set_price(double price) {
	this.price = price;
}
public double get_price() {
	return price;
}

public void set_number(int number) {
	this.number = number;
}
public int get_number() {
	return number;
}

public void set_weight(double weight) {
	this.weight = weight;
}
public double get_weight() {
	return weight;
}

public Laptop() {
	
}

public Laptop(double speed_of_CPU, double capacity_of_RAM, String name, double size_of_display) {
	this.speed_of_CPU = speed_of_CPU;
	this.capacity_of_RAM = capacity_of_RAM;
	this.name = name;
	this.size_of_display = size_of_display;
}

public Laptop(double speed_of_CPU, double capacity_of_RAM, String name, double size_of_display, double price, int number, double weight) {
	this(speed_of_CPU, capacity_of_RAM, name, size_of_display);
	this.price = price;
	this.number = number;
	this.weight = weight;
}

public void to_string() {
	System.out.println("name = "+name+"\n"+"speed of CPU = "+speed_of_CPU+" GHz"+"\n"+"capacity of RAM = "+capacity_of_RAM+" GB"+"\n"+"size of display = "+size_of_display+"″"+"\n"+"price = "+price+" ₴"+"\n"+"number = "+number+"\n"+"weight = "+weight+" kg"+"\n");
}

static public void print_static​_number_of_monitors() {
	System.out.println("number of monitors = "+number_of_monitors);
}

public void print_number_of_monitors() {
	System.out.println("number of monitors = "+number_of_monitors);
}

public void reset_values(double speed_of_CPU, double capacity_of_RAM, String name, double size_of_display, double price, int number, double weight) {
	this.speed_of_CPU = speed_of_CPU;
	this.capacity_of_RAM = capacity_of_RAM;
	this.name = name;
	this.size_of_display = size_of_display;
	this.price = price;
	this.number = number;
	this.weight = weight;
}

}
