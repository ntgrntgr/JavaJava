package diceRollerPD;
import java.util.ArrayList;

public class DiceBag {
	private int numberOfDice;
	private int total;
	private ArrayList<Die> diceBag;
	public DiceBag() {
		setNumberOfDice(5);
		
	}
	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = this.diceBag.size();
	}
	public int getNumberOfDice() {
		return numberOfDice;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void roll() {
		int tempTotal = 0;
		for(int i = 0; i < numberOfDice; i++) {
		 diceBag.get(i).roll();
		 tempTotal += diceBag.get(i).getCurrentFace();
			
		}
		setTotal(tempTotal);
	}
	public String toString() {
		return Integer.toString(getTotal());
		
	}

}
