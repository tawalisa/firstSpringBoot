package com.lijia.helloworld.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lijia.helloworld.model.Customer;
import com.lijia.helloworld.model.User;

@RestController
@RequestMapping(value = "/users")
public class MyRestController {

	@RequestMapping(value = "/{user}", method = RequestMethod.GET)
	public User getUser(@PathVariable Long user) {
		System.out.println("getUser....."+user);
		User u = new User();
		u.setId(1L);
		u.setName("number1");
		return u;
	}

	@RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
	List<Customer> getUserCustomers(@PathVariable Long user) {
		System.out.println("getUserCustomers....."+user);
		List<Customer> list = new ArrayList<Customer>();
		Customer u = new Customer();
		u.setId(1L);
		u.setName("number1");
		list.add(u);
		u = new Customer();
		u.setId(2L);
		u.setName("number2");
		list.add(u);
		return list;
	}

	@RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
	public User deleteUser(@PathVariable Long user) {
		System.out.println("deleteUser....."+user);
		User u = new User();
		u.setId(1L);
		u.setName("number1");
		return u;
	}

}