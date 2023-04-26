package org.karthik.bharath.springdata.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.karthik.bharath.springdata.customer.entities.Customer;
import org.karthik.bharath.springdata.customer.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	CustomerRepository repository; 
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void createData() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("John");
		customer.setEmail("John@gmail.com");
		repository.save(customer);
		
	}
	
	@Test
	void readData() {
		Customer customer = repository.findById(1).get();
		assertNotNull(customer);
		assertEquals("John", customer.getName());
	}
	
	@Test
	void updateData() {
		Customer customer = repository.findById(1).get();
		customer.setEmail("john123@gmail.com");
		repository.save(customer);
		assertEquals("john123@gmail.com", customer.getEmail());
	}
	
	@Test
	void deleteData() {
		repository.deleteById(1);
	}
	

}
