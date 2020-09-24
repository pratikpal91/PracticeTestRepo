package ApperalStore.MyApperalStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ApperalStore.MyApperalStore.pojo.Address;
import ApperalStore.MyApperalStore.pojo.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/insert")
	public String insertCustomer()
	{
		Address paymentaddress = new Address();
		paymentaddress.setAddressLine1("house 8");
		paymentaddress.setAddressLine2("9th cross, 16th Main BTM");
		paymentaddress.setCity("Bangalore");
		paymentaddress.setState("Karnataka");
		paymentaddress.setCountry("India");
		paymentaddress.setPostalCode("560029");
		
		Address deliveryAddress = new Address();
		deliveryAddress.setAddressLine1("house 9");
		deliveryAddress.setAddressLine2("10th cross, 16th Main BTM");
		deliveryAddress.setCity("Bangalore");
		deliveryAddress.setState("Karnataka");
		deliveryAddress.setCountry("India");
		deliveryAddress.setPostalCode("560029");
		
				
		List<Address> deliveryAddresses = new ArrayList<Address>();
		deliveryAddresses.add(deliveryAddress);
		
		List<Address> paymentAddresses = new ArrayList<Address>();
		paymentAddresses.add(paymentaddress);
		
		Customer customer = new Customer();
		customer.setUid("Pratik");
		customer.setName("Pratik Pal");
		customer.setEmailId("pratikpal91@gmail.com");
		customer.setPhoneNumber("7846051418");
		customer.setDeliveryAddress(deliveryAddresses);
		customer.setPaymentAddress(paymentAddresses);
		
		customerRepository.save(customer);
		
		
		
		return "Success";
	}
	
	@GetMapping("/getCustomerByName/{name}")
	public List<Customer> getCustomerByName(@PathVariable(value="name") String name){
		return customerRepository.getCustomerByName(name);		
	}

}
