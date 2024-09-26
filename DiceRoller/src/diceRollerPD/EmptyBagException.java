package diceRollerPD;

public class EmptyBagException extends Exception {
	public EmptyBagException(String errorMessage) {
		/**
		 * displays a message when the user tries to roll the dicebag when it is empty
		 * @param message which is a message to be displayed
		 */
		super(errorMessage);
	}

}
