
public class Dealer {
	//instance variables
	private String name;
	private String address;
	private Car[] cars;
	private int totalInventoryPrice;
	private int numberCars;
	
	//default constructor
	public Dealer() {
		cars = new Car[10];
		numberCars = 0;
	}
	
	//constructor
	public Dealer(String name,String address) {
		this();
		this.setName(name);
		this.setAddress(address);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Car[]getCars(){
		return cars;
	}
	public void addCar(Car car) {
		cars[numberCars] = car;
		numberCars++;
	}
	public int getTotalInventoryPrice() {
		this.allCarsPrice();
		return totalInventoryPrice;
	}
	public void setTotalInventoryPrice(int totalInventoryPrice) {
		this.totalInventoryPrice = totalInventoryPrice;
	}
	
	//other methods for the dealer class
	public void removeCar(Car car) {
		int carLocation = -1;
		for(int i = 0; i < numberCars; i++) {
			if(cars[i] == car)
				carLocation = i;
		}
		if (carLocation != -1) {
			for (int j = carLocation; j < numberCars - 1; j++)
				cars[j] = cars[j+1];
			numberCars--;
		}
	}
	public int getCarCount() {
		return numberCars;
	}
	public void allCarsPrice() {
		int retailTotal = 0 ;
		for(int i = 0; i < this.numberCars; i++) {
			retailTotal += this.getCars()[i].getRetailPrice();
		}
	 setTotalInventoryPrice(retailTotal);
	}
	public void printAllCars() {
		System.out.println(this.toString());
		for(int i = 0; i < this.getCarCount(); i++) {
			System.out.println(this.getCars()[i]);
		}
	}
	public void removeAllCars() {
		while(numberCars > 0) {
			this.removeCar(cars[0]);
		}
	}
	public String toString() {
		return name;
	}

}
