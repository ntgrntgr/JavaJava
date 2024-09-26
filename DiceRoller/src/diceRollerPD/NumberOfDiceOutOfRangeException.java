package diceRollerPD;

public class NumberOfDiceOutOfRangeException extends Exception{
	/**
	 * displays a message when the user enters dice less or equal to 2
	 * @param message which is a message to be displayed
	 */
	public NumberOfDiceOutOfRangeException(String errorMessage) {
		super(errorMessage);
	}

}