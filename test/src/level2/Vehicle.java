package level2;

public abstract class Vehicle {
	int wheelCount;
	int seats;
	String manufacturer;
	int value;
	public Vehicle(String manufacturer, int wheelCount, int seats, int value) {
		this.manufacturer=manufacturer;
		this.wheelCount=wheelCount;
		this.seats=seats;
		this.value=value;
	}
	public int getRepairCost() {
		return 0;
	}
}
