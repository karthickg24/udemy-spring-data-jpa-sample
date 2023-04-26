package org.karthik.bharath.springdata.customer.repos;

import org.karthik.bharath.springdata.customer.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
