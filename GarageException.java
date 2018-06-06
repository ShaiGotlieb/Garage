//class GarageException throwing exception if needed
public class GarageException extends Exception {
	
	//variable that contain error message
	private String msg;

	//constructor - get error message and initialize into the string msg
	public GarageException(String errorMsg) {
		this.msg = errorMsg;
	}
}//end of class GarageException
