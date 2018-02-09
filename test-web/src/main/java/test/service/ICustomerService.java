package test.service;

import test.model.entity.Customers;

public interface ICustomerService {
	
	public Customers findCustomer(Integer id);
}
