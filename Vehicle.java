//class Vehicle represent a vehicle
public class Vehicle {
	//variables of Vehicle
	private String number;
	private String vehicleType;
	private int year;
	private String comment;

	//constructor - initialize Vehicle's variable 
	public Vehicle(String number, String vehicleType, int year, String comment) {
		this.number = number;
		this.vehicleType = vehicleType;
		this.year = year;
		this.comment = comment;
	}

	//getters and setters
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override//detail of Vehicle to be printed
	public String toString() {
		return "Vehicle Plate Number: " + number + "| Type of Vehicle: " + vehicleType + "| Year of Made: " + year + "| Comment: " + comment + " | ";
	}
}// end of class Vehicle
