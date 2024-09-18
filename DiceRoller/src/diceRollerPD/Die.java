package diceRollerPD;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Die {
	private int numberOfFaces;
	private int currentFace;
	private Map<Integer, Integer> faceFrequencyMap = new HashMap<>();
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
	public String toString() {
		return Integer.toString(getCurrentFace());
		
	}

}
