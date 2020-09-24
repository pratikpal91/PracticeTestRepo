package ApperalStore.MyApperalStore.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ApperalStore.MyApperalStore.pojo.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
}
