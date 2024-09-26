package diceRollerPD;

public class NumberOfFacesOutOfRangeException extends Exception{
	/**
	 * displays a message when the user enters faces lesser than 2
	 * @param message which is a message to be displayed
	 */
	public NumberOfFacesOutOfRangeException(String errorMessage) {
		super(errorMessage);
		
	}
}
