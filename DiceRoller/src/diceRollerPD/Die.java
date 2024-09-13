package diceRollerPD;
import java.util.Random;
public class Die {
	private int numberOfFaces;
	private int currentFace;
	Random random = new Random();
	
	public Die() {
		setNumberOfFaces(6);
		setCurrentFace(1);
		
	}
	public Die(int numberOfFaces) {
		this();
		setNumberOfFaces(numberOfFaces);
		
	}
	public void setNumberOfFaces(int numberOfFaces) {
		this.numberOfFaces = numberOfFaces;
	}
	public int getNumberOfFaces() {
		return numberOfFaces;
	}
	public void setCurrentFace(int currentFace) {
		this.currentFace = currentFace;
	}
	public int getCurrentFace() {
		return currentFace;
	}
	public void roll() {
		setCurrentFace((random.nextInt(3)+1));
		
	}
	public void roll(int numberOfFaces) {
		setCurrentFace((random.nextInt(numberOfFaces)+1));
	}
	public String toString() {
		return Integer.toString(getCurrentFace());
		
	}

}
