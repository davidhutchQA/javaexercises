package level2;

public class Motorbike extends Vehicle {
	String type; //stunt, racing etc
	/**
	 * 
	 * @param manufacturer
	 * @param wheelCount
	 * @param seats
	 * @param type
	 * @param value
	 */
	public Motorbike(String manufacturer, String type, int value) {
		super(manufacturer, 2, 1, value);
		this.type=type;
	}	
	
	@Override
	public int getRepairCost() {
		int repairCost=15000;
		if (type=="Stunt")
			repairCost+=5000;
		else if (type=="racing")
			repairCost+=2000;
		else
			repairCost+=1000;
		return repairCost;
	}
}
