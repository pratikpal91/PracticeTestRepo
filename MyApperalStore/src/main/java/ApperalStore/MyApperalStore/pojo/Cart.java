package ApperalStore.MyApperalStore.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CART")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UID", nullable=false, updatable=false)
	private int uid;
	
	@Column(name="QUANTITY", nullable=false)
	private int quanity;
		
	@ElementCollection
	private List<CartEntries> cartEntries;
	
	@Column(name="TOTALBASEPRICE", columnDefinition="float default 0.0")
	private float totalBasePrice;
	
	@Column(name="TAX", columnDefinition="float default 0.0")
	private float tax;
	
	@Column(name="TOTALPRICEWITHTAX", columnDefinition="float default 0.0")
	private float totalPriceWithTax;
	
	@Column(name="TOTALDISCOUNT", columnDefinition="float default 0.0")
	private float totalDiscount;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public List<CartEntries> getCartEntries() {
		return cartEntries;
	}

	public void setCartEntries(List<CartEntries> cartEntries) {
		this.cartEntries = cartEntries;
	}

	public float getTotalBasePrice() {
		return totalBasePrice;
	}

	public void setTotalBasePrice(float totalBasePrice) {
		this.totalBasePrice = totalBasePrice;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getTotalPriceWithTax() {
		return totalPriceWithTax;
	}

	public void setTotalPriceWithTax(float totalPriceWithTax) {
		this.totalPriceWithTax = totalPriceWithTax;
	}

	public float getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(float totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	
}
