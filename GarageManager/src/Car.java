
public class Car {

//	attributes
	private String color;
	private String licenseNum;
	private String make;
	private String model;
	
//	multiple constructors
	public Car() {
		
	}
	
	public Car(String myColor, String myLicense, String myMake, String myModel) {
		color = myColor;
		licenseNum = myLicense;
		make = myMake;
		model = myModel;
	}
	
//	G&S
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getLicenseNum() {
		return licenseNum;
	}
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
		
}
