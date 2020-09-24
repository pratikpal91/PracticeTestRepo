package ApperalStore.MyApperalStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ApperalStore.MyApperalStore.pojo.Cart;
import ApperalStore.MyApperalStore.pojo.CartEntries;
import ApperalStore.MyApperalStore.pojo.Product;

@RestController
@RequestMapping("/cart")
public class CartController {

	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/insert")
	public String insertCart()
	{
		
		Product product1 = new Product();
		product1.setCode("10001");
		product1.setName("Puma Shoes");
		product1.setStock(100);
		product1.setSupplier("Puma Inc.");
		product1.setPrice(2000.0);
		productRepository.save(product1);
		
		
		Product product2 = new Product();
		product2.setCode("10002");
		product2.setName("Addidas Shoes");
		product2.setStock(100);
		product2.setSupplier("Addidas Inc.");
		product2.setPrice(2500.0);
		productRepository.save(product2);
		
		CartEntries cartEntry1 = new CartEntries();
		cartEntry1.setProduct(product1);
		cartEntry1.setQuantity(2);
		cartEntry1.setPrice(4000.0f);
		cartEntry1.setTax(23.20f);
		cartEntry1.setDiscount(0.0f);
		
		CartEntries cartEntry2 = new CartEntries();
		cartEntry2.setProduct(product2);
		cartEntry2.setQuantity(2);
		cartEntry2.setPrice(5000.20f);
		cartEntry2.setTax(25.20f);
		cartEntry2.setDiscount(0.0f);
		
		List<CartEntries> entries = new ArrayList<CartEntries>();
		entries.add(cartEntry1);
		entries.add(cartEntry2);
		
		Cart cart = new Cart();
		cart.setQuanity(4);
		cart.setCartEntries(entries);
		cart.setTax(48.40f);
		cart.setTotalBasePrice(9000.0f);
		cart.setTotalDiscount(0.0f);
		cart.setTotalPriceWithTax(9048.40f);
		
		cartRepository.save(cart);
		
		
		return "SUCCESS";
		
		
	}
	
	
}
