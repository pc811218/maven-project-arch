package test.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import test.dao.ICustomerDao;
import test.model.entity.Customers;

@Repository
public class CustomerDao implements ICustomerDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private static final String FIND_CUSTM_BY_ID = "from Customers where id=:id";

	public Customers findCustomer(Integer id) {
		Customers result = null;
		Query query = entityManager.createQuery(FIND_CUSTM_BY_ID);
		query.setParameter("id", id);
		result = (Customers) query.getSingleResult();
		return result;
	} 
	

}
