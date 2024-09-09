package NumberMagic;

public class NumberMagic {

	public static void main(String[] args) {
		int result;
		int originalNumber = 15; // any number
		
		//add one to the number
		result = originalNumber + 1;
		
		//multiply the result by two
		result = result * 2;
		
		// add four to the result
		result = result + 4;
		
		//divide the result by 2
		result = result / 2;
		
		//subtract the original number 
		result = result - originalNumber;
		
		System.out.println("Your result should be 3");
		System.out.println("result is " + result);

	}

}
