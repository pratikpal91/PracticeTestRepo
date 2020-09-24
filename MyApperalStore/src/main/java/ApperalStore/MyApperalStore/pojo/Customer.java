package ApperalStore.MyApperalStore.pojo;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USERID", nullable=false)
	private String uid;
	
	@Column(name="NAME",nullable=false, length=100)
	private String name;
	
	@Column(name="EMAILID",nullable=false)
	private String emailId;
	
	@Column(name="PHONENO",nullable=false,length=10)
	private String phoneNumber;
	
	//@Embedded
	@ElementCollection
	@Column(name="DELIVERYADDRESS",nullable=false)
	private Collection<Address> deliveryAddress;	
	
	//@Embedded
	@ElementCollection
	@Column(name="PAYMENTADDRESS", nullable=false)
	private Collection<Address> paymentAddress;
	
	@Column(name="SAVEDCART")
	@OneToMany
	private Collection<Cart> savedCart;
	
	@OneToMany
	@Column(name="Orders")
	private Collection<Cart> orders;

	public Collection<Address> getPaymentAddress() {
		return paymentAddress;
	}

	public void setPaymentAddress(Collection<Address> paymentAddress) {
		this.paymentAddress = paymentAddress;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Collection<Address> getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Collection<Address> deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Collection<Cart> getOrders() {
		return orders;
	}

	public void setOrders(List<Cart> orders) {
		this.orders = orders;
	}

	public Collection<Cart> getSavedCart() {
		return savedCart;
	}

	public void setSavedCart(List<Cart> savedCart) {
		this.savedCart = savedCart;
	}
	
}
