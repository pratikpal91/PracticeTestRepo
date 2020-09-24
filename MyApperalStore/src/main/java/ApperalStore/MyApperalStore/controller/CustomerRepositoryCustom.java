package ApperalStore.MyApperalStore.controller;

import java.util.List;

import ApperalStore.MyApperalStore.pojo.Customer;

public interface CustomerRepositoryCustom {
	
	
	public List<Customer> getCustomerByName(String name);

}
