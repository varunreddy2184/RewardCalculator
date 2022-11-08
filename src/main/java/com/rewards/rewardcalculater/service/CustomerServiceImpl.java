package com.rewards.rewardcalculater.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rewards.rewardcalculater.model.Customer;
import com.rewards.rewardcalculater.util.DataUtil;

@Service
public class CustomerServiceImpl implements CustomerService {


	public 	Customer getCustomerByCustomerId(int customerId) {
		List<Customer> customers=DataUtil.getAllCustomers();
		for (Customer customer : customers) {
			if(customer.getCustomerId()==customerId)
				return customer;
		}
			return null;
				
			
		
	}

}
