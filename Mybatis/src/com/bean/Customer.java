package com.bean;

import java.util.List;

public class Customer {
	private Integer customerId;  
    private String customerName;  
    private Integer customerTel;  
    private List<Ticket> tickets;
    
    public Customer() {
		// TODO Auto-generated constructor stub
	}
    
    
	public Customer(Integer customerId, String customerName, Integer customerTel, List<Ticket> tickets) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerTel = customerTel;
		this.tickets = tickets;
	}


	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomerTel() {
		return customerTel;
	}
	public void setCustomerTel(Integer customerTel) {
		this.customerTel = customerTel;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public Customer(Integer customerId, String customerName, Integer customerTel) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerTel = customerTel;
	}
    
    @Override
    public String toString() {
    	return "Customer [customerId=" + customerId + ", customerName="  
                + customerName + ", customerTel=" + customerTel+"]";  
    }
}
