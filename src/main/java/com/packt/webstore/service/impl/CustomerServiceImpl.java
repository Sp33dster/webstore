package com.packt.webstore.service.impl;

import java.util.List;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.service.CustomerService;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
				return customerRepository.getAllCustomers();
	}

}
