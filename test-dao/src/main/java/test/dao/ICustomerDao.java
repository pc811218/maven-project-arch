package test.dao;

import test.model.entity.Customers;

public interface ICustomerDao {
	Customers findCustomer(Integer id);
}
