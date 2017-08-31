package com.usti.repository;

import com.usti.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testSavingAndRetrieving() throws Exception {
        Customer customer = new Customer();
        customer.setName("A");

        Customer saved = customerRepository.save(customer);
        assertThat(saved, notNullValue());
        assertThat(saved.getId(), notNullValue());

        Customer retrievedCustomer = customerRepository.findOne(saved.getId());
        assertThat(retrievedCustomer.getName(), equalTo("A"));
    }

}