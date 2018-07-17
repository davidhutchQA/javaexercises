package level2;

public class Plane extends Vehicle {
	boolean isPrivate; //isPrivate
	/**
	 * 
	 * @param manufacturer the vehicle manufacturer
	 * @param wheelCount the number of wheels
	 * @param seats number of seats
	 * @param isPrivate is the plane private or passenger
	 * @param cost how much is it worth
	 */
	public Plane(String manufacturer, int wheelCount, int seats, boolean isPrivate, int cost) {
		super(manufacturer, wheelCount, seats, cost);
		this.isPrivate=isPrivate;
	}
	@Override
	public int getRepairCost() {
		int repairCost=100000;
		if (manufacturer=="EasyJet")
			repairCost+=200000;

		if (seats>20)
			repairCost+=100000;
		else
			repairCost+=80000;

		return repairCost;
	}
}
