package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.impl.CustomerDao;
import test.model.entity.Customers;
import test.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	CustomerDao customerDao; 
	
	@Override
	public Customers findCustomer(Integer id) {
		return customerDao.findCustomer(id);
	}

}
