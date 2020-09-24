package ApperalStore.MyApperalStore.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import ApperalStore.MyApperalStore.pojo.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> , CustomerRepositoryCustom {

}
