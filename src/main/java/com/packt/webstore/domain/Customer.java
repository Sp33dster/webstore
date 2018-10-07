package com.packt.webstore.domain;

public class Customer {

	private Integer customerId;
	private String name;
	private String address;
	private Integer noOfOrdersMade;
	
	
	public Customer() {
		super();
	}
	public Customer(Integer customerId, String name, String address) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setNoOfOrdersMade(Integer noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	public Integer getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	
	
	
	
}
