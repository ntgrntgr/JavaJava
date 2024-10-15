package diceRollerPD.imports;
/**
 * NumberOfFacesRangeException is a class that defines the exception when the user rolls the dice when it is empty
 * @package PD
 * @author Ange Gabriel NTIGURIRWA
 */
public class EmptyBagException extends Exception {
	public EmptyBagException(String errorMessage) {
		/**
		 * displays a message when the user tries to roll the dicebag when it is empty
		 * @param message which is a message to be displayed
		 */
		super(errorMessage);
	}

}
