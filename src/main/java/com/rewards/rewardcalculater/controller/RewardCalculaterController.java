package com.rewards.rewardcalculater.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.rewardcalculater.model.Customer;
import com.rewards.rewardcalculater.model.Rewards;
import com.rewards.rewardcalculater.model.Transaction;
import com.rewards.rewardcalculater.model.TransactionDTO;
import com.rewards.rewardcalculater.service.CustomerService;
import com.rewards.rewardcalculater.service.RewardService;
import com.rewards.rewardcalculater.service.RewardServiceImpl;
import com.rewards.rewardcalculater.service.TransactionService;

@RestController
@RequestMapping("/")
public class RewardCalculaterController {
	

	@Autowired
	private RewardService rewardService;

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private CustomerService customerService;
	
	 @GetMapping(value = "customers/{id}/rewards",produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> getPointsByCustomerId(@PathVariable("id") Long id){
	        Customer customer = customerService.getCustomerByCustomerId(id.intValue());
	        if(customer == null)
	        {
	        	Map<String,String> errorMap=new HashMap<>();
	        	errorMap.put("errorMessage", "No Member Found");
		        return new ResponseEntity<>(errorMap,HttpStatus.OK);
	        }
	        Rewards rewards = rewardService.getPointsByCustomerId(id);
	        return new ResponseEntity<>(rewards,HttpStatus.OK);
	    }
	 @GetMapping(value = "transaction/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> getTransactionById(@PathVariable("id") Long id){
	        Transaction transaction = transactionService.getTransactionById(id.intValue());
	        if(transaction == null)
	        {
	        	Map<String,String> errorMap=new HashMap<>();
	        	errorMap.put("errorMessage", "No Transaction Found");
		        return new ResponseEntity<>(errorMap,HttpStatus.OK);
	        }
	        return new ResponseEntity<>(transaction,HttpStatus.OK);
	    }
	 @GetMapping(value = "customers/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> getCustomerById(@PathVariable("id") Long id){
	        Customer customer = customerService.getCustomerByCustomerId(id.intValue());
	        if(customer == null)
	        {
	        	Map<String,String> errorMap=new HashMap<>();
	        	errorMap.put("errorMessage", "No Customer Found");
		        return new ResponseEntity<>(errorMap,HttpStatus.OK);
	        }
	        return new ResponseEntity<>(customer,HttpStatus.OK);
	    }
	 
	 @PostMapping(value = "rewards",produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> addTransaction(@RequestBody TransactionDTO transactionDTO){
	        Boolean isAdded = transactionService.addTransaction(transactionDTO);
	        if(!isAdded)
	        {
	        	Map<String,String> errorMap=new HashMap<>();
	        	errorMap.put("errorMessage", "Transaction Not saved ");
		        return new ResponseEntity<>(errorMap,HttpStatus.OK);
	        }
	        return new ResponseEntity<>(transactionDTO,HttpStatus.OK);
	    }

  
}
