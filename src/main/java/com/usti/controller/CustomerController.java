package com.usti.controller;

import com.usti.entity.Customer;
import com.usti.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET)
    private String customerList(Model model) {
        PageRequest pageRequest = new PageRequest(0, 50);

        Iterable<Customer> customerList = customerRepository.findAll(pageRequest);

        model.addAttribute("customerList", customerList);
        return "customer-list";
    }
}
