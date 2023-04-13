package com.springbatch.app.config;

import org.springframework.batch.item.ItemProcessor;

import com.springbatch.app.entity.Customer;

public class CustomItemProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer customerItem) throws Exception {

		return customerItem;
	}

}
