package com.ws.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ws.rest.service.Customer;

@Path("/customer")
public class RestWebService {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public String getCustomerDetails()
	{
    	return "Pratik";//CustomerDetails().toString();    	
	}

	private List<Customer> CustomerDetails() {
		
		Customer c1 = new Customer("c1",20,"Banglore",true);
		Customer c2 = new Customer("c2",21,"London",true);
		Customer c3 = new Customer("c3",22,"Germany",false);
		Customer c4 = new Customer("c1",20,"California,USA",true);
		
		List<Customer> list = new ArrayList<>();
				list.add(c1);
				list.add(c2);
				list.add(c3);
				list.add(c4);
			
		return list;
	}
	

}
