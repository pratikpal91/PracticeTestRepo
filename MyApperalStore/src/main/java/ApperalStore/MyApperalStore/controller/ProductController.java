package ApperalStore.MyApperalStore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ApperalStore.MyApperalStore.pojo.Product;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public String insertProductEntry(){
		
		Product product = new Product();
		product.setCode("10001");
		product.setName("Puma Shoes");
		product.setStock(100);
		product.setSupplier("Puma Inc.");
		product.setPrice(2000.0);
		productRepository.save(product);
		
		return "Success";
	}
	
	@GetMapping("/viewAll")
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	@PostMapping("/products")
	public Product createProduct(@Valid @RequestBody Product product)
	{
		return productRepository.save(product);
	}
	
	
	
}
