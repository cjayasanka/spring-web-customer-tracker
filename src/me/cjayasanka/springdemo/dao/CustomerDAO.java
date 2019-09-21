package me.cjayasanka.springdemo.dao;

import java.util.List;

import me.cjayasanka.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers(); 

}
