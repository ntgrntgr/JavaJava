package posPD;

import java.util.*;

/**
 * This class represents a cashier for the store
 */
public class Cashier {

	private String number;
	private Person person;
	private ArrayList<Session> sessions;
	private String password;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Cashier() {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * sets the info about a cashier
	 * params number, person,password
	 * @param number
	 * @param person
	 * @param password
	 */
	public Cashier(String number, String person, String password) {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
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