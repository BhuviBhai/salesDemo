package com.sale.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sale.demo.response.SalesData;

@Service
public interface SalesDataService {

	List<SalesData> getAllSelesData();


	List<SalesData> getAllSelesDataByCity(String city);

	List<SalesData> getFieldSetData(String product_line, Date date, String city);

	List<SalesData> getSalesAmtAndBranchData(Double amt, String branch);

	 
}
