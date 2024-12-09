// Car  
package dealerPD;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity(name = "car")
public class Car implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id // signifies the primary key
  	@Column(name = "car_id",nullable = false)
  	@GeneratedValue(strategy = GenerationType.AUTO)
  
  private Long carID;
  
  @Column(name = "make",nullable = false, length = 50)
  private String make;
  
  @Column(name = "model", nullable = false, length = 50)
  private String model;
  
  @Column(name = "year", nullable = false, length = 50)
  private String year;
  
  @Column(name = "color", nullable = true, length = 50)
  private String color;
  
  @Column(name = "price", nullable = false, precision = 7, scale = 2)
  private BigDecimal price;
  
  @Column(name = "date_purchased", nullable = false)
  private LocalDate datePurchased;
  
  @Column(name = "date_sold", nullable = false)
  private LocalDate dateSold;
  
  @ManyToOne(optional=true)
  @JoinColumn(name = "salesPerson_id",referencedColumnName="salesPerson_id")
  private SalesPerson salesPerson;
  
  @Column(name="serial_number", nullable = false, length = 50)
  private String serialNumber;
  
  @ManyToOne(optional=true)
  @JoinColumn(name="dealer_id",referencedColumnName="dealer_id")
  private Dealer dealer;
  
  
  
  public Long getCarID() {
	return carID;
}

public void setCarID(Long carID) {
	this.carID = carID;
}

public Car() {
    
  };
  
  public Car (String serialNumber,String make, String model, String year, String color, String date, String price)
  {
    this();
    this.serialNumber = serialNumber;
    this.make = make;
    this.model = model;
    this.year = year;
    this.setColor(color);
    this.setDatePurchased(LocalDate.parse(date, DateTimeFormatter.ofPattern("M/d/yyyy")));
    this.price = new BigDecimal(price);
  }
  
  
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getYear() {
    return year;
  }
  public void setYear(String year) {
    this.year = year;
  }
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }
  public LocalDate getDatePurchased() {
    return datePurchased;
  }
  public void setDatePurchased(LocalDate datePurchased) {
    this.datePurchased = datePurchased;
  }


  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public SalesPerson getSalesPerson() {
    return salesPerson;
  }


  public void setSalesPerson(SalesPerson salesPerson) {
    this.salesPerson = salesPerson;
  }


  public LocalDate getDateSold() {
    return dateSold;
  }


  public void setDateSold(LocalDate dateSold) {
    this.dateSold = dateSold;
  }
  
  public boolean isOkToRemove() {
    if (getSalesPerson() == null) return true; else return false;
  }
  
  public String toString() {
    return getMake()+" "+getModel()+" "+getYear()+" "+getSerialNumber();
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
}
