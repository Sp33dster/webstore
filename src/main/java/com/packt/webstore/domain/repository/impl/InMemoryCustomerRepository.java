package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository () {
		Customer adam = new Customer(1, "Adam", "£ódz gdzieniegdzie");
		adam.setNoOfOrdersMade(0);
		
		Customer zosia = new Customer(2, "zosia", "Warszawka");
		zosia.setNoOfOrdersMade(2);
		
		Customer krzysiu = new Customer(3,"Krzysiu", "Znienacka");
		krzysiu.setNoOfOrdersMade(0);
		
		listOfCustomers.add(adam);
		listOfCustomers.add(zosia);
		listOfCustomers.add(krzysiu);
		
		
	}
	
	public List<Customer> getAllCustomers() {
				return listOfCustomers;
	}
	

}
