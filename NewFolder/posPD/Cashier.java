package posPD;

import java.util.*;

/**
 * This class represents a cashier for the store
 */
public class Cashier extends Person{

	
	private ArrayList<Session> sessions;
	private String password;
	private Long cashierID;

	public Long getNumber() {
		return this.cashierID;
	}

	public void setNumber(Long number) {
		this.cashierID = number;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public Cashier() {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * sets the info about a cashier
	 * parameters number, person,password
	 * @param number
	 * @param person
	 * @param password
	 */
	public Cashier(Long number, String password, String name, String address, String city, String state, String zip, String phone, String sSN) {
		
		super(name,address,city,state,zip,phone,sSN);
		setNumber(number);
		setPassword(password);
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * adds a session
	 * params session for the session to be added
	 * @param session
	 */
	public void addSession(Session session) {
		// TODO - implement Cashier.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * removes a session
	 * params session for the session to be removed
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Cashier.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * checks if password is authorized
	 * params password for the password to be checked
	 * @param passwordd
	 */
	public boolean isAuthorized(String passwordd) {
		// TODO - implement Cashier.isAuthorized
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Cashier.toString
		throw new UnsupportedOperationException();
	}

}