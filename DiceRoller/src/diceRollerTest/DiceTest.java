package diceRollerTest;
import diceRollerPD.Die;

import java.util.HashMap;
import java.util.Map;

import diceRollerPD.DiceBag;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiceTest {
	public static void main(String[]args) {
		/**Scanner scanner = new Scanner(System.in);
		int faces;
		int numberDices;
		System.out.println("Enter number of Faces: ");
        faces = scanner.nextInt();
        System.out.println("Enter number of Dice");
        numberDices = scanner.nextInt();
		Die die = new Die();
		die.roll();
		System.out.println(die.toString());*/
		 
		
		/*DiceBag diceBag = new DiceBag(numberDices,faces);
		diceBag.roll();
		System.out.println("Total is: " + diceBag.toString());*/
		//DiceBag diceBag2 = new DiceBag(2,6);
		//System.out.println(diceBag2.getNumberOfDice());
		//diceBag2.diceRollFrequency();
		
		Die die = new Die(7);
		die.dieRollFrequency();
		
		
	}

}
