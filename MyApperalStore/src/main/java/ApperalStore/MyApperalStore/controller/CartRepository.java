package ApperalStore.MyApperalStore.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import ApperalStore.MyApperalStore.pojo.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
