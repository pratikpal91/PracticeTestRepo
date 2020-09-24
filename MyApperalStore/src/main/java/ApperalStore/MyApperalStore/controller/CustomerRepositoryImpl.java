package ApperalStore.MyApperalStore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import ApperalStore.MyApperalStore.pojo.Customer;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{
	
	@Autowired
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Customer> getCustomerByName(String name) {
		
		StringBuilder stringQuery = new StringBuilder("select c.* from my_apperal_store.customer as c where name like ?");
        Query query = entityManager.createNativeQuery(stringQuery.toString());
		query.setParameter(1,"%"+name+"%");
		List<Object> list = query.getResultList();
		
		for(Object value : list)
		{
			System.out.println(value);
		}
		
		return new ArrayList<Customer>();
	}

}
