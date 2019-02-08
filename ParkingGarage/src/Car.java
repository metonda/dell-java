
public class Car {

// attributes
	public String color;
	public String make;
	public String model;
	public String licenseNum;
	
//	constructor
	public Car(String myColor, String myMake, String myModel, String myLicenseNum) {
		
	}
	
// G&S
	public String getColor() {
		return color;
	}
	
	public void setColor(String myColor) {
		this.color = myColor;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String myModel) {
		this.model = myModel;
	}
	
	public String getMyLicenseNum() {
		return licenseNum;
	}
	
	public void setLicenseNum(String MyLicenseNum) {
		this.licenseNum = MyLicenseNum;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String myMake) {
		this.make = myMake;
	}
	
}
