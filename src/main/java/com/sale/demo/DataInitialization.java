package com.sale.demo;

import org.springframework.boot.CommandLineRunner;

import com.sale.demo.utility.TestUtility;

public class DataInitialization implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		TestUtility.getDataFromCSV();
	}

}
