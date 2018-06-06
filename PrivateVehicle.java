//class PrivateVehicle represent a specific car owner of a vehicle
public class PrivateVehicle extends Vehicle {
    //variable of PrivateVehicle
	private String ownerName;

	//constructor - initialize var of Vehicle and owner name - inheritance from Vehicle
	public PrivateVehicle(String number, String vehicleType, int year, String comment, String ownerName) {
		super(number, vehicleType, year, comment);
		this.ownerName = ownerName;
	}

	@Override//method to save vehicle detail into string - to be printed
	public String toString() {
		return "Private Vehicle | Owner Name: | " + ownerName + " | " + super.toString();
	}
}//end of class PrivateVehicle
