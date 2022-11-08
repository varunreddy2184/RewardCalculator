package com.rewards.rewardcalculater.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rewards.rewardcalculater.model.Customer;
import com.rewards.rewardcalculater.model.Transaction;


@Component
public class DataUtil {
	
	
	
	public static List<Customer> customersList=new ArrayList<>();	
	public static List<Transaction> transactionsList=new ArrayList<>();
	
	public DataUtil()
	{
		Customer customer1=new Customer();
		customer1.setCustomerId(1l);
		customer1.setCustomerName("Andreaw");		
		customersList.add(customer1);

		Customer customer2=new Customer();
		customer2.setCustomerId(2l);
		customer2.setCustomerName("John ");		
		customersList.add(customer2);

		Customer customer3=new Customer();
		customer3.setCustomerId(3l);
		customer3.setCustomerName("Wang ");		
		customersList.add(customer3);
		
		Transaction transaction1=new Transaction();
		transaction1.setCustomerId(1l);
		transaction1.setTransactionAmount(456);
		transaction1.setTransactionDate(new Timestamp(new Date().getTime()));
		transaction1.setTransactionId(1l);			
		transactionsList.add(transaction1);

		Transaction transaction2=new Transaction();
		transaction2.setCustomerId(2l);
		transaction2.setTransactionAmount(248);
		transaction2.setTransactionDate(new Timestamp(new Date().getTime()));
		transaction2.setTransactionId(2l);			
		transactionsList.add(transaction2);


		Transaction transaction3=new Transaction();
		transaction3.setCustomerId(3l);
		transaction3.setTransactionAmount(208);
		transaction3.setTransactionDate(new Timestamp(new Date().getTime()));
		transaction3.setTransactionId(3l);			
		transactionsList.add(transaction3);



		Transaction transaction4=new Transaction();
		transaction4.setCustomerId(1l);
		transaction4.setTransactionAmount(265);
		transaction4.setTransactionDate(Timestamp.valueOf("2022-09-09 00:00:00"));
		transaction4.setTransactionId(4l);			
		transactionsList.add(transaction4);



		Transaction transaction5=new Transaction();
		transaction5.setCustomerId(2l);
		transaction5.setTransactionAmount(109);
		transaction5.setTransactionDate(Timestamp.valueOf("2022-09-09 00:00:00"));
		transaction5.setTransactionId(5l);			
		transactionsList.add(transaction5);



		Transaction transaction6=new Transaction();
		transaction6.setCustomerId(3l);
		transaction6.setTransactionAmount(312);
		transaction6.setTransactionDate(Timestamp.valueOf("2022-09-09 00:00:00"));
		transaction6.setTransactionId(6l);			
		transactionsList.add(transaction6);



		Transaction transaction7=new Transaction();
		transaction7.setCustomerId(1l);
		transaction7.setTransactionAmount(800);
		transaction7.setTransactionDate(Timestamp.valueOf("2022-10-09 00:00:00"));
		transaction7.setTransactionId(7l);			
		transactionsList.add(transaction7);

		Transaction transaction8=new Transaction();
		transaction8.setCustomerId(2l);
		transaction8.setTransactionAmount(761);
		transaction8.setTransactionDate(Timestamp.valueOf("2022-10-09 00:00:00"));
		transaction8.setTransactionId(7l);			
		transactionsList.add(transaction8);


		Transaction transaction9=new Transaction();
		transaction9.setCustomerId(3l);
		transaction9.setTransactionAmount(919);
		transaction9.setTransactionDate(Timestamp.valueOf("2022-10-09 00:00:00"));
		transaction9.setTransactionId(7l);			
		transactionsList.add(transaction9);
		
	}

	

	public static List<Customer> getAllCustomers() {
		return customersList;
	}


	public static List<Transaction>  getAllTransactionData() {
	

		return transactionsList;

	}

	
}
