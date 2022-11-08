package com.rewards.rewardcalculater.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rewards.rewardcalculater.model.Customer;
import com.rewards.rewardcalculater.model.Transaction;
import com.rewards.rewardcalculater.model.TransactionDTO;
import com.rewards.rewardcalculater.util.DataUtil;
@Service
public class TransactionServiceImpl implements TransactionService {

	@Override
	public Transaction getTransactionById(int transactionId) {
		List<Transaction> transactions=DataUtil.getAllTransactionData();
		for (Transaction transaction : transactions) {
			if(transaction.getTransactionId()==transactionId)
				return transaction;
		}
			return null;
	}

	@Override
	public Boolean addTransaction(TransactionDTO transactionDTO) {
		List<Customer> customersList=DataUtil.customersList;
		List<Transaction> transactionsList=DataUtil.transactionsList;
		try {
			Customer customer=new Customer();
			customer.setCustomerId(transactionDTO.getCustomerId());
			customer.setCustomerName(transactionDTO.getCustomerName());
			customersList.add(customer);
			Transaction transaction=new Transaction();
			transaction.setCustomerId(transactionDTO.getCustomerId());
			transaction.setTransactionAmount(transactionDTO.getTransactionAmount());
			transaction.setTransactionDate(Timestamp.valueOf(transactionDTO.getTransactionDate()));
			transaction.setTransactionId(transactionDTO.getTransactionId());
			transactionsList.add(transaction);
			return true;
		}
		catch (Exception e) {
			return false;
			}

	}

}
