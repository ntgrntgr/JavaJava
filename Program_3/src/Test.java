
public class Test {
	public static void main(String[]args) {
		//local variables
		Dealer dealer;
		Car car;
		
		//create a new dealer instance
		dealer = new Dealer("David's Car Lot","Edmond,OK");
		
		//create Car Instances and add to Dealer's collection
		
		//create Car instances
		Car car1 = new Car("JX123456708","Chevrolet","Malibu",1976,"Maroon");
		Car car2 = new Car("LG12312489","Triump","Tr6",1973,"Green");
		Car car3 = new Car("TY12348908","Alpha","Spyder",1985,"Red");
		Car car4 = new Car("QU12463484","Porsche","911-Cabrolet",1984,"Red");
		
		
		
		//add the cars to the Dealer's collection
		dealer.addCar(car1);
		dealer.addCar(car2);
		dealer.addCar(car3);
		dealer.addCar(car4);
		
		//print out all the cars
		dealer.printAllCars();
		
		/**
		 * 
		 * 
		 * Added this inside the dealer class under "printAllCars" method
		 * 
		 * 
		System.out.println(dealer);
		for(int i = 0; i < dealer.getCarCount();i++) {
			System.out.println(dealer.getCars()[i]);
		}
		*/
		
		//remove a car
		dealer.removeCar(car2);
		
		//print out all the cars
		dealer.printAllCars();
		dealer.removeCar(car1);
		dealer.removeCar(car3);
		dealer.removeCar(car4);
		//dealer.removeAllCars();
		
		//create custom Car instances
		Car customCar1 = new Car("XY1234AB56", "Toyota", "Supra", 1994, "White");
		Car customCar2 = new Car("PQ9876CD34", "BMW", "M3", 2001, "Silver");
		Car customCar3 = new Car("UV5432EF21", "Audi", "R8", 2015, "Green");
		Car customCar4 = new Car("MN6789GH90", "Nissan", "GT-R", 2019, "Graphite");
		
		dealer.addCar(customCar1);
		dealer.addCar(customCar2);
		dealer.addCar(customCar3);
		dealer.addCar(customCar4);
		
		dealer.printAllCars();
		
		//creation of new cars but with a retail price
		Car customCar5 = new Car("JK76543210", "Lamborghini", "Huracán", 2018, "Orange",200);
		Car customCar6 = new Car("MN87654321", "Mazda", "MX-5 Miata", 2016, "Red",30);
		Car customCar7 = new Car("OP23456789", "Subaru", "WRX", 2020, "Blue",35);
		Car customCar8 = new Car("QR34567890", "Honda", "Civic Type R", 2019, "White",37);
		Car customCar9 = new Car("ST45678901", "Tesla", "Model S", 2021, "Black",80);
		
		//adding the new created cars to the dealer
		dealer.addCar(customCar5);
		dealer.addCar(customCar6);
		dealer.addCar(customCar7);
		dealer.addCar(customCar8);
		dealer.addCar(customCar9);
		
		//print out all cars
		dealer.printAllCars();
		
		//printing out the total retail price for the custom cars with a retail price
		//System.out.println(customCar5.getRetailPrice());
		//System.out.println(dealer.getCars()[5]);
		
		
		System.out.println(dealer.getTotalInventoryPrice());
		
		
		//remove one car to check if the method id working properly
		dealer.removeCar(customCar5);
		System.out.println(dealer.getTotalInventoryPrice());
		

		
		
	}

}
