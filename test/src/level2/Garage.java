package level2;

import java.util.LinkedList;

public class Garage {
	LinkedList<Vehicle> list=new LinkedList<Vehicle>();

	public Garage() {
		list.add(new Plane("EasyJet", 6, 60, false, 19000000));
		list.add(new Car("Peugeot", 4, 5, false, false, 200000, 5));
		list.add(new Motorbike("Harley","Racing", 40000));
	}

	public boolean removeVehicle(int id) {
		if (id<=list.size()&&id>=0) {
			list.remove(id);
			return true;
		}
		return false;
	}
	public String getRepairCost(int id) {
		String result="";
		if (id>=0&&id<list.size()) {
			if (list.get(id) instanceof Car)
				result="Car: ";
			else if (list.get(id) instanceof Plane)
				result="Plane: ";
			else if (list.get(id) instanceof Motorbike)
				result="Motorbike: ";
			return result+list.get(id).getRepairCost();
		}
		return "Not a valid ID";
	}

	public boolean removeVehicle(String type) {
		for(int i=0;i<list.size();i++) {
			if (type=="Motorbike") {
				if (list.get(i) instanceof Motorbike) {
					list.remove(i);
					return true;
				}
			}else if (type=="Car") {
				if (list.get(i) instanceof Car) {
					list.remove(i);
					return true;
				}
			}else if (type=="Plane") {
				if (list.get(i) instanceof Plane)
					list.remove(i);
				return true;
			}
		}
		return false;
	}
}
