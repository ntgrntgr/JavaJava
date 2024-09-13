package diceRollerTest;
import diceRollerPD.Die;

public class DiceTest {
	public static void main(String[]args) {
		Die die = new Die();
		die.roll();
		System.out.println(die.toString());
	}

}
