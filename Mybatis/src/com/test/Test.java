package com.test;

import java.util.List;

import com.bean.Customer;
import com.bean.Ticket;
import com.impl.Impl;

public class Test {
	public static void main(String[] args) {
		Impl im=new Impl();
		
		Customer cu=im.getCus("С��");
		if(cu!=null){
			List<Ticket> list=cu.getTickets();
			for(Ticket t:list){
				System.out.println(t);
			}
		}else{
			System.out.println("û������");
		}
		Ticket tc=im.getTic(1);
		if(tc!=null){
			System.out.println(tc.getCustomer());
		}else{
			System.out.println("û������");
		}
	}
}
