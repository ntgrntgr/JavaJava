package diceRollerPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DiceBag {
	private int numberOfDice;
	private int total;
	private ArrayList<Die> diceBag = new ArrayList<Die>();
	 private Map<Integer, Integer> faceFrequencyMap = new HashMap<>();
	
	public DiceBag() {
		setNumberOfDice(0);
		setTotal(0);
		
	}
	public DiceBag(int numberOfDice, int numberOfFaces) {
		this();
		for(int i = 0; i < numberOfDice;i++) {
			addDieToBag(new Die(numberOfFaces));
			setNumberOfDice(diceBag.size());
		}
	}
	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
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
	public void addDieToBag(Die die) {
		diceBag.add(die);
	}
	public void roll() {
		int tempTotal = 0;
		for(Die die: diceBag) {
			die.roll(die.getNumberOfFaces());
			
			tempTotal += die.getCurrentFace();
			System.out.println(die.toString());
			
		}
		setTotal(tempTotal);
		
	}
	public void diceRollFrequency() {
		
	        int tempTotal = 0;
	        faceFrequencyMap.clear();  // Clear the map before each roll

	        for(int i = 0; i < 100; i++) {
	        for (Die die : diceBag) {
	            die.roll(die.getNumberOfFaces());
	            int currentFace = die.getCurrentFace();
	            
	            // Update the total
	            tempTotal += currentFace;

	            // Check if the current face is already in the map
	            if (faceFrequencyMap.containsKey(currentFace)) {
	                // If present, increment the frequency
	                faceFrequencyMap.put(currentFace, faceFrequencyMap.get(currentFace) + 1);
	            } else {
	                // If not present, add it with frequency 1
	                faceFrequencyMap.put(currentFace, 1);
	            }

	            System.out.println(die.toString());
	        }}

	        setTotal(tempTotal);
	        System.out.println(faceFrequencyMap.toString());
	    
	}
	
	public String toString() {
		return Integer.toString(getTotal());
		
	}

}
