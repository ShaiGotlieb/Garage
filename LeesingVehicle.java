//class LeesingVehicle represent a workers vehicle from a company
public class LeesingVehicle extends Vehicle {
	//variables of LeesingVehicle
	private String company;
	private String worker;
	
	//constructor - create LeesingVehicle with variable that inherited from Vehicle and company name and worker
	public LeesingVehicle(String number, String vehicleType, int year, String comment, String nameOfCompany, String workerName) {
		super(number, vehicleType, year, comment);
		this.company = nameOfCompany;
		this.worker = workerName; 
	}

	@Override//method to save Leesing Vehicle detail into string - to be printed
	public String toString() {
		return "Leesing Vehicle | Company Name: " + company + "| Worker Name: " + worker + "| " + super.toString();
	}
}//end of class LeesingVehicle
