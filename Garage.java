import java.util.Iterator;
import java.util.LinkedList;

//class Garage represent a garage that can hold different vehicles 
public class Garage<T extends Vehicle> {
	//variable of Garage
	private final int capacity;//final because we can;t change garage's capacity
	private LinkedList<T> carsLinkedList;

	//constructor - create the size of the garage(number of maximum vehicles) and create linkedList to hold vehicles
	public Garage(int capacity) {
		this.capacity = capacity;
		carsLinkedList = new LinkedList<T>();
	}

	//add vehicle to the garage queue
	public void add(T vehicle) throws GarageException {
		//check if vehicle is null
		if (vehicle == null) {
			throw new IllegalArgumentException("Vehicle is null!");
		}
		//check if garage is full
		if (carsLinkedList.size() == capacity) {
			throw new GarageException("Garage is full!");
		}
		//add vehicle to the linkedList
		carsLinkedList.add(vehicle);
	}

	//method that let the garage work on a car and return the first car in line (last in linkedList)
	public T work() {
		//check if no cars in the garage
		if (carsLinkedList.isEmpty())
			return null;
		//return last vehicle in the linkedList
		return carsLinkedList.poll();
	}

	//method that remove a vehicle by its license number
	public T remove(String license) {
		//check if empty - no car to remove
		if (carsLinkedList.isEmpty())
			return null;
		//iteration through linkedList and remove car by iterator of license number
		for (Iterator iterator = carsLinkedList.iterator(); iterator.hasNext();) {
			T car = (T) iterator.next();
			//use equals because car's number is string
			if (car.getNumber().equals(license)) {
				carsLinkedList.remove(car);
				return car;
			}
		}
		//return null if vehicle doesn't exist
		return null;
	}
	
	//method to return current number of vehicles in garage
	public int size() {
		return this.carsLinkedList.size();
	}
	
	//detail of Vehicles to be printed
	@Override
	public String toString() {
		String str = "";
		for (Iterator<T> iterator = carsLinkedList.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			str += t.toString() + "\n";
		}
		return str;
	}
}//end of class Garage
