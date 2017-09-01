package com.bean;

public class Ticket {
	private Integer ticketId;  
    private String ticketAddress;  
    private Integer ticketPrice;  
    private Integer ticketCId;  
    private Customer customer;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketAddress() {
		return ticketAddress;
	}
	public void setTicketAddress(String ticketAddress) {
		this.ticketAddress = ticketAddress;
	}
	public Integer getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public Integer getTicketCId() {
		return ticketCId;
	}
	public void setTicketCId(Integer ticketCId) {
		this.ticketCId = ticketCId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Ticket(Integer ticketId, String ticketAddress, Integer ticketPrice, Integer ticketCId) {
		super();
		this.ticketId = ticketId;
		this.ticketAddress = ticketAddress;
		this.ticketPrice = ticketPrice;
		this.ticketCId = ticketCId;
	}
    
    @Override
    public String toString() {
    	return "Ticket [ticketId=" + ticketId + ", ticketAddress="  
                + ticketAddress + ", ticketPrice=" + ticketPrice  
                + ", ticketCId=" + ticketCId + "]";
    }
}
