package diceRollerPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DiceBag {
	private int numberOfDice;
	private int total;
	String diceBagUI = "";
	private ArrayList<Die> diceBag = new ArrayList<Die>();
	private Map<Integer, Integer> faceFrequencyMap = new HashMap<>();
	
	/**
	 * Default Constructor 
	 * Creates a new bag with both 0 dice 
	 * and total is zero
	 * @author ntgr
	 */
	
	public DiceBag() {
		setNumberOfDice(0);
		setTotal(0);
		
	}
	/**
	 * Constructor that takes two parameters 
	 * to specify the number of Dice in the bag
	 * and number of faces the dice will have
	 * @param numberOfDice
	 * @param numberOfFaces
	 */
	public DiceBag(int numberOfDice, int numberOfFaces) throws NumberOfDiceOutOfRangeException, NumberOfFacesOutOfRangeException{
		this();
		if(numberOfDice <= 0 ) {
			throw new NumberOfDiceOutOfRangeException("NumberOfDiceOutOfRange");
		}
		for(int i = 0; i < numberOfDice;i++) {
			addDieToBag(new Die(numberOfFaces));
			setNumberOfDice(diceBag.size());
		}
	}
	
	/**
	 * setter for numberOfDice attribute
	 * @param numberOfDice
	 */
	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}
	
	/**
	 * getter for numberOfDice attribute
	 * @return numberOfDice
	 */
	public int getNumberOfDice() {
		return numberOfDice;
	}
	
	/**
	 * getter for total of the bag
	 * @return total
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * setter for total of the bag attribute
	 * 
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	
	/**
	 * add to bag method
	 * this method adds a die to the bag
	 * @param die
	 */
	public void addDieToBag(Die die) {
		diceBag.add(die);
	}
	
	/**
	 * roll method will roll all dice in the bag
	 * and add up the faces from each die 
	 * into the bag total
	 */
	public void roll() throws EmptyBagException{
		if(diceBag.isEmpty()) {
			throw new EmptyBagException("Empty bag");
		}
		int tempTotal = 0;
		for(Die die: diceBag) {
			die.roll(die.getNumberOfFaces());
			
			tempTotal += die.getCurrentFace();
			System.out.println(die.toString());
			
		}
		setTotal(tempTotal);
		
	}
	public void rollForUI() throws EmptyBagException{
		
		
		if(diceBag.isEmpty()) {
			throw new EmptyBagException("Empty bag");
		}
		int tempTotal = 0;
		for(Die die: diceBag) {
			die.roll(die.getNumberOfFaces());
			
			tempTotal += die.getCurrentFace();
			System.out.println(die.toString());
			diceBagUI += die.toString();
			
		}
		setTotal(tempTotal);
		//return diceBagUI;
		
	}
	
	/**
	 * dieRollFrequency rolls the totality of dice in the bag 
	 * and records the frequency a face occurs  
	 * 
	 */
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
	
	/**
	 * toString returns the total number when the bag is rolled
	 */
	
	public String toString() {
		return Integer.toString(getTotal());
		
	}
	public String toStringV()  throws EmptyBagException{
		String value = this.toString() + " " + diceBagUI;
		return value;
	}

}
