
public class ParkingGarage {

//	array of cars in spots
	private Car[] parkingSpots;
	
//	constructor
	public ParkingGarage() {
		
	}
	
//	initialize array / given by the user
	public ParkingGarage(int numSpots) {
		parkingSpots = new Car[numSpots];
	}

//	G&S
	public Car[] getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(Car[] parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	
//	methods
	public void park(Car car, int spot) {
		
	}
	
	public void vacate(int spot) {
		
	}
	public void printInventory() {
		
	}
}
