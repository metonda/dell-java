
public class GarageManager {

	public static void main(String[] args) {

//		instantiate cars
		Car car1 = new Car("blue", "Chevy", "Impala","43434" );
		Car car2 = new Car("red", "Toyota", "Camry", "12345");
		Car car3 = new Car("silver", "Honda", "Accord", "54321");
		Car car4 = new Car("white", "Audi", "A4", "78901");

		
//		instantiate parking garages
		ParkingGarage garage1 = new ParkingGarage(3);
		ParkingGarage garage2 = new ParkingGarage(3);
		ParkingGarage garage3 = new ParkingGarage(3);

}
}