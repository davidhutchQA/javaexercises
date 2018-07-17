package level2;

public class Car extends Vehicle{
	boolean sunRoof;
	boolean rearWheelDrive;
	int doors;
	/**
	 * 
	 * @param manufacturer
	 * @param wheelCount
	 * @param seats
	 * @param sunRoof
	 * @param rearWheelDrive
	 * @param value
	 * @param doors
	 */
	public Car(String manufacturer, int wheelCount, int seats, boolean sunRoof, boolean rearWheelDrive, int value, int doors) {
		super(manufacturer, wheelCount, seats, value);
		this.doors=doors;
		this.sunRoof=sunRoof;
		this.rearWheelDrive=rearWheelDrive;
	}
	@Override
	public int getRepairCost() {
		int repairCost=1000;
		if (sunRoof)
			repairCost+=2000;

		if (rearWheelDrive)
			repairCost+=10000;
		else
			repairCost+=5000;
		if (doors>3)
			repairCost+=2000;
		else repairCost+=100;
		return repairCost;
	}
}
