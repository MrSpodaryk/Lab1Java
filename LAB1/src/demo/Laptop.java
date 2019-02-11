package demo;

public class Laptop {
	
private double speedOfCPU;
private double capacityOfRAM;
private String name;
private double sizeOfDisplay;
private double price;	

protected int number;
protected double weight;

static int numberOfMonitors = 1;

public Laptop() {

}

public Laptop(double speedOfCPU, double capacityOfRAM, String name, double sizeOfDisplay, double price, int number, double weight) {
	this.speedOfCPU = speedOfCPU;
	this.capacityOfRAM = capacityOfRAM;
	this.name = name;
	this.sizeOfDisplay = sizeOfDisplay;
	this.price = price;
	this.number = number;
	this.weight = weight;
}

public Laptop(double speedOfCPU, double capacityOfRAM, String name, double sizeOfDisplay) {
	this(speedOfCPU, capacityOfRAM, name, sizeOfDisplay, 0.0, 0, 0.0);
}

public String toString() {
	String information;
	information = "name = "+name+"\n";
	information += "speed of CPU = "+speedOfCPU+" GHz"+"\n";
	information +="capacity of RAM = "+capacityOfRAM+" GB"+"\n";
	information +="size of display = "+sizeOfDisplay+"″"+"\n";
	information +="price = "+price+" ₴"+"\n";
	information +="number = "+number+"\n";
	information +="weight = "+weight+" kg"+"\n";
	return information;
}

public static void printStatic​NumberOfMonitors() {
	System.out.println("number of monitors = "+numberOfMonitors);
}

public void printNumberOfMonitors() {
	System.out.println("number of monitors = "+numberOfMonitors);
}

public void resetValues(double speedOfCPU, double capacityOfRAM, String name, double sizeOfDisplay, double price, int number, double weight) {
	this.speedOfCPU = speedOfCPU;
	this.capacityOfRAM = capacityOfRAM;
	this.name = name;
	this.sizeOfDisplay = sizeOfDisplay;
	this.price = price;
	this.number = number;
	this.weight = weight;
}

public double getSpeedOfCPU() {
	return speedOfCPU;
}

public void setSpeedOfCPU(double speedOfCPU) {
	this.speedOfCPU = speedOfCPU;
}

public double getCapacityOfRAM() {
	return capacityOfRAM;
}

public void setCapacityOfRAM(double capacityOfRAM) {
	this.capacityOfRAM = capacityOfRAM;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSizeOfDisplay() {
	return sizeOfDisplay;
}

public void setSizeOfDisplay(double sizeOfDisplay) {
	this.sizeOfDisplay = sizeOfDisplay;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

}
