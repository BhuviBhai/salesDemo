package com.sale.demo.service.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sale.demo.response.SalesData;
import com.sale.demo.service.SalesDataService;
import com.sale.demo.utility.TestUtility;

@Component
public class SalesDataServiceImpl implements SalesDataService {

	@Override
	public List<SalesData> getAllSelesData() {

		return TestUtility.getDataFromCSV();

	}

	 
	@Override
	public List<SalesData> getAllSelesDataByCity(String data) {
		List<SalesData> dataFromCSV = TestUtility.getDataFromCSV();
		Comparator<SalesData> cityComparator;
		switch (data) {
		case "city": 
			cityComparator = (city1, city2) -> city1.getCity().compareTo(city2.getCity());
			break;
		case "branch": 
			cityComparator = (city1, city2) -> city1.getBranch().compareTo(city2.getBranch());
			break;
		case "invoiceId": {
			cityComparator = (city1, city2) -> city1.getInvoiceID().compareTo(city2.getInvoiceID());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + data);
		}
		 
		List<SalesData> sortedCityList = dataFromCSV.stream().sorted(cityComparator) // 1st compare Name
				// .thenComparing(cityComparatorLEx) // then 2nd compare City
				// .thenComparing(ageComparatorLEx)) // then 3rd compare Age
				.collect(Collectors.toList());
		return sortedCityList;

	}

	@Override
	public List<SalesData> getFieldSetData(String product_line, Date date, String city) {
		List<SalesData> dataFromCSV = TestUtility.getDataFromCSV();

		List<SalesData> collect = dataFromCSV.stream().filter(
				c -> c.getProductLine().equals(product_line) && c.getDate().equals(date) && c.getCity().equals(city))
				.collect(Collectors.toList());

		return collect;
		// TODO Auto-generated method stub

	}

	@Override
	public List<SalesData> getSalesAmtAndBranchData(Double amt, String branch) {
		List<SalesData> dataFromCSV = TestUtility.getDataFromCSV();
		List<SalesData> collect = dataFromCSV.stream()
				.filter(c -> c.getTotal().equals(amt) && c.getBranch().equals(branch)).collect(Collectors.toList());
		return collect;
	}

}
