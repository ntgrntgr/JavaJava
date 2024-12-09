package DAO;


import java.util.List;
import jakarta.persistence.TypedQuery;
import dealerPD.Car;

public class carDAO {

public static void addCar(Car car) {
		EM.getEM().persist(car);
	}
		
	public static void saveCar(Car car) {
		EM.getEM().persist(car);
	}

	public static List<Car> listCar() {
		TypedQuery<Car> query = EM.getEM().createQuery(
"SELECT car FROM car car", Car.class);
		return query.getResultList();
	}

	public static Car findCarById(int id) {
		Car car = EM.getEM().find(Car.class, new Integer(id));
		return car;
	}
	
	public static void removeCar(Car car) {
		EM.getEM().remove(car);
	}

}
