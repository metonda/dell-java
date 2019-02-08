public interface Rentable {

// *as a template, all 'child' classes must implement all methods of the interface

	public String getDescription();
	public double getDailyRate();
	public double getPrice(double days); // use the data type 'double'

}

