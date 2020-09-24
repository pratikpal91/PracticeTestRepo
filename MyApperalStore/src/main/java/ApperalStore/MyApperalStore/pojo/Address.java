package ApperalStore.MyApperalStore.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Embeddable
public class Address {
	
	@Column(name="ADDRESSLINE1", length=100)
	private String addressLine1;
		
	@Column(name="ADDRESSLINE2", length=100)
	private String addressLine2;
	
	@Column(name="CITY", length=50)
	private String city;
	
	@Column(name="STATE", length=50)
	private String state;
	
	@Column(name="COUNTRY", length=50)
	private String country;
	
	@Column(name="POSTALCODE", length=20)
	private String postalCode;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	

}
