
public class ParkingGarage {

//	array
	Car[] carArray;
	
//	constructor
	public ParkingGarage(int capacity) {
		Car[] carArray = new Car[capacity];
		
	}
	
//	methods
	public void park(Car car, int spot) {
		carArray[spot] = car;
		if (spot > carArray.length) {
			System.out.println("That spot doesn't exist.");
		}
		if (carArray[spot] != null) {
			System.out.println("That space is filled.");
		}
		}
	
	public void vacate(int spot) {
		
		if (carArray[spot] == null)
			System.out.println("There is no car in that spot.");
		}

	public void printInventory() {
		for (int i = 0; i < carArray.length; i++) {
			System.out.println("My car at spot " + i + "is " + carArray[i].color);
			
		}
	}
	
	}

