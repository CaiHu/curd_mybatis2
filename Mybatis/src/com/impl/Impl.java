package com.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bean.Customer;
import com.bean.Ticket;
import com.mapper.CustomerMapper;
import com.mapper.TicketMapper;


public class Impl {
	private static Reader reader;
	private static SqlSessionFactory ssf;
	
	static{
		try {
			reader=Resources.getResourceAsReader("mybatis.xml");
			ssf=new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Customer getCus(String customerName){
		SqlSession session=ssf.openSession();
		CustomerMapper cp= session.getMapper(CustomerMapper.class);
		Customer cus=cp.getCustomer(customerName);
		return cus;
	}
	
	
	public Ticket getTic(int ticketId){
		SqlSession session=ssf.openSession();
		TicketMapper tm= session.getMapper(TicketMapper.class);
		Ticket tct=tm.getTicket(ticketId);
		return tct;
	}
	
}
