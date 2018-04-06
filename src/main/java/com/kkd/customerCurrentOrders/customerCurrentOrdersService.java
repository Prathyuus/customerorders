package com.kkd.customerCurrentOrders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class customerCurrentOrdersService {
 
	public static List<Orders> currentOrders = new ArrayList<Orders>();
	public List<Orders> findCurrentOrders(List<Orders> customerOrders)
	{
		Iterator<Orders> iter = customerOrders.iterator();
	    while(iter.hasNext()) {
	    Orders order = iter.next();
		if(order.getOrderStatus().equals("complete"))
		{
			currentOrders.add(order);
			
		}}
		return currentOrders;
	}
	}

