/*
 * Author: Shai Gotlieb
 * Date: 23/05/2018
 */
//class GarageMain contain main - create garages and handling
public class GarageMain {
	public static void main(String[] args) {
		//creating garages
		Garage<Vehicle> carGarage = new Garage<>(10);
		Garage<PrivateVehicle> privateGarage = new Garage<>(10);
		Garage<LeesingVehicle> leesingGarage = new Garage<>(10);

		//creating vehicles 
		for (int i = 0; i < 10; i++) {
			Vehicle vehicle = null;
			//creating 3 different vehicles type
			switch (i % 3) {
			case 0:
				vehicle = new Vehicle("11122333" + i, "Yaris", 2000 + i, "Gas Type: 97");
				break;
			case 1:
				vehicle = new PrivateVehicle("11122333" + i, "Polo", 2000 + i, "Please Do Not Smoke Inside The Car", "Shai");
				break;
			case 2:
				vehicle = new LeesingVehicle("11122333" + i, "SuperTanker", 2000 + i, "Can't reach more than 90km/h", "The Open University", "Shai");
				break;
			}
			//try to add vehicle to garage and handling exceptions
			try {
				carGarage.add(vehicle);
				System.out.println("Vehicle was added	  | " + vehicle.toString());
			} catch (GarageException e) {
				System.out.println("Couldn't add vehicle | " + vehicle.toString());
			}
		}

		//adding Vehicle to privateGarage
		for (int i = 0; i < 10; i++) {
			PrivateVehicle vehicle = new PrivateVehicle("11122999" + i, "Unique", 1970 + i, "Special Sun Roof","Shai");
			//try to add vehicle to private garage and handling exceptions
			try {
				privateGarage.add(vehicle);
				System.out.println("Private vehicle was added | " + vehicle.toString());
			} catch (GarageException e) {
				System.out.println("Couldn't add private vehicle | " + vehicle.toString());
			}
		}
	}//end of main
}//end of class GarageMain
