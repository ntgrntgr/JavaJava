// Sales Person
package dealerPD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import DAO.carDAO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity(name = "salesPerson")
public class SalesPerson implements Serializable {
	private static final long serialVersionUID = 1L;	

@Id //primary key
	@Column(name = "salesperson_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Long salesPersonID;

@Column(name = "name", nullable = false, length = 50)
  private String name;
  
@Column(name = "position", nullable = false, length = 50)
  private String position;

@OneToMany(mappedBy="salesPerson", targetEntity = Car.class,
		fetch = FetchType.EAGER)
	private Collection<Car> cars;

@ManyToOne(optional = true)
@JoinColumn(name = "dealer_id", referencedColumnName = "dealer_id")
	private Dealer dealer;
  
  
  public Dealer getDealer() {
	return dealer;
}

public void setDealer(Dealer dealer) {
	this.dealer = dealer;
}

public Long getSalesPersonID() {
	return salesPersonID;
}

public void setSalesPersonID(Long salesPersonID) {
	this.salesPersonID = salesPersonID;
}

public SalesPerson(){
//    cars = new ArrayList<Car>();
  }
  
  public SalesPerson( String name, String position) {
    this();
    this.setName(name);
    this.setPosition(position);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }
  public Collection<Car> getCars() {
    return cars;
  }
  
  public void addCar(Car car) {
	  
    carDAO.addCar(car);
  }
  
  public void removeCar(Car car)
  {
    carDAO.removeCar(car);
  }
  
  public boolean isOkToRemove() {
    if (getCars().size() == 0) return true; else return false;
  }
  
  public String toString() {
    return getName()+ " "+getPosition();
  }
}
