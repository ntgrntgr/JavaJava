package posPD;

/**
 * This is an instance of a person with his information
 */
public class Person {

	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String sSN;
	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSSN() {
		return this.sSN;
	}

	public void setSSN(String sSN) {
		this.sSN = sSN;
	}

	public Person() {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the name and other info about a person
	 * Params name for name , person for other info about a person
	 * @param name
	 * @param person
	 */
	public Person(String name, Person person) {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}
	

	/**
	 * @param name
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 * @param sSN
	 * @param cashier
	 */
	public Person(String name, String address, String city, String state, String zip, String phone, String sSN
			) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.sSN = sSN;
		
	}

	public String toString() {
		// TODO - implement Person.toString
		throw new UnsupportedOperationException();
	}

}