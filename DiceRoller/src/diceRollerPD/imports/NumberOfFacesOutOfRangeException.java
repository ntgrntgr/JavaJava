package PD;
/**
 * NumberOfFacesRangeException is a class that defines the exception when usser enters faces less or equal than 2
 * @package PD
 * @author Ange Gabriel NTIGURIRWA
 */
public class NumberOfFacesOutOfRangeException extends Exception{
	/**
	 * displays a message when the user enters faces lesser than 2
	 * @param message which is a message to be displayed
	 */
	public NumberOfFacesOutOfRangeException(String errorMessage) {
		super(errorMessage);
		
	}
}
