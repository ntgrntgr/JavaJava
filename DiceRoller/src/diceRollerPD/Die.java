package diceRollerPD;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Die {
	private int numberOfFaces;
	private int currentFace;
	private Map<Integer, Integer> faceFrequencyMap = new HashMap<>();
	Random random = new Random();
	
	/**
	 * Default constructor
	 * creates a new Die with 6 faces
	 * and the rolled face to 1
	 * @author ntgr
	 * 
	 */
	public Die() {
		setNumberOfFaces(6);
		setCurrentFace(1);
		
	}
	
	/**
	 * Custom constructor with number
	 * of faces as input
	 * @param numberOfFaces
	 */
	public Die(int numberOfFaces) throws NumberOfFacesOutOfRangeException{
		this();
		if(numberOfFaces <=0) {
			throw new NumberOfFacesOutOfRangeException("NumberofFacesOutOfRange");
		}
		setNumberOfFaces(numberOfFaces);
		
	}
	
	/**
	 * setter for number of faces
	 * takes number of faces as input 
	 * @param numberOfFaces
	 */
	public void setNumberOfFaces(int numberOfFaces) {
		this.numberOfFaces = numberOfFaces;
	}
	
	/**
	 * getter for number of faces
	 * returns the number of faces 
	 * @return
	 */
	public int getNumberOfFaces() {
		return numberOfFaces;
	}
	
	/**
	 * setter for current face
	 * takes current faces as input
	 * @param currentFace
	 */
	public void setCurrentFace(int currentFace) {
		this.currentFace = currentFace;
	}
	
	/**
	 * getter for current face
	 * returns the current face of a die
	 * @return
	 */
	public int getCurrentFace() {
		return currentFace;
	}
	
	/**
	 * default roll method
	 * takes no input and should set the die face
	 * to a random number
	 */
	public void roll() {
		setCurrentFace((random.nextInt(3)+1));
		
	}
	
	/**
	 * custom roll method
	 * takes number of faces as input 
	 * This is used when you want to specify the number of faces 
	 * the die have before you roll
	 * @param numberOfFaces
	 */
	public void roll(int numberOfFaces) {
		setCurrentFace((random.nextInt(numberOfFaces)+1));
	}
	
	/**
	 * this method rolls one die 100 times and return the 
	 * frequency at which faces occurred 
	 * It stores them in a Map for more optimal access
	 */
	public void dieRollFrequency() {
		faceFrequencyMap.clear(); 
		for(int i = 0; i < 100; i++) {
			this.roll(this.getNumberOfFaces());
			int currentFace = this.getCurrentFace();
           
            

            // Check if the current face is already in the map
			
            if (faceFrequencyMap.containsKey(currentFace)) {
                
                faceFrequencyMap.put(currentFace, faceFrequencyMap.get(currentFace) + 1);
            } else {
                
                faceFrequencyMap.put(currentFace, 1);
            }
            

		}
		System.out.println(faceFrequencyMap.toString());
		
	}
	
	/**
	 * toString method returns the current face of the die
	 * in an integer form 
	 */
	public String toString() {
		return Integer.toString(getCurrentFace());
		
	}

}
