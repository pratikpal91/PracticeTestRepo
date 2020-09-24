package ApperalStore.MyApperalStore.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@Column(name="CODE", nullable=false)
	private String code;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="SUPPLIER", nullable=false)
	private String supplier;
	
	@Column(name="STOCK", nullable=false)
	private long stock;
	
	@Column(name="PRICE", nullable=false, columnDefinition="double default 0.0" )
	private double price ; 
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}

}
