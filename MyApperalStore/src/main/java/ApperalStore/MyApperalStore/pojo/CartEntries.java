package ApperalStore.MyApperalStore.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Embeddable
public class CartEntries {
		
	//@Column(name="PRODUCT", nullable =false)
	@OneToOne
	private Product product;
	
	@Column(name="QUANTITY", nullable =false)
	private int quantity;
	
	@Column(name="PRICE", nullable =false)
	private float price;
	
	@Column(name="TAX", nullable =false)
	private float tax;
	
	@Column(name="DISCOUNT", nullable =false)
	private float discount;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	

}
