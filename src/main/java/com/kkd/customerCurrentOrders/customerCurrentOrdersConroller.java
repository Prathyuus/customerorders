package com.kkd.customerCurrentOrders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerCurrentOrdersConroller {
	
	@Autowired
	private customerCurrentOrdersService customers;
	public static List<Orders> customerOrders= new ArrayList<Orders>();
	static {
	customerOrders.add(new Orders("farm1","prod1","cust1","ord1","complete"));
	customerOrders.add(new Orders("farm1","prod1","cust1","ord1","failed"));
	customerOrders.add(new Orders("farm1","prod1","cust1","ord1","complete"));
	}
	
	public static List<Orders> currentOrders = new ArrayList<Orders>();

	
	@GetMapping("/customerCurrentOrders")
	public List<Orders> currentOrdersList()
	{
		currentOrders=customers.findCurrentOrders(customerOrders);
		return  currentOrders;
		
		    
	}
	
}
