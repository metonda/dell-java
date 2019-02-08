
public class RentableProgram {

	public static void main(String[] args) {

		Rentable[] rentalList = new Rentable [3];
		Room room1 = new Room ("Best Western", 50.00);
//		add 2 more
		
		rentalList[0] = room1;
//		add 2 more
		
		for (int i=0; i < rentalList.length, i++) {
			System.out.println(rentalList[i].getDescription());
		}
		
	}

}
