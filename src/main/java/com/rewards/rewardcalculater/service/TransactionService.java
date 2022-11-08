package com.rewards.rewardcalculater.service;

import org.springframework.stereotype.Service;

import com.rewards.rewardcalculater.model.Transaction;
import com.rewards.rewardcalculater.model.TransactionDTO;

@Service
public interface TransactionService {
	public 	Transaction getTransactionById(int trnsactionId);
	public Boolean addTransaction(TransactionDTO transactionDTO);


}
