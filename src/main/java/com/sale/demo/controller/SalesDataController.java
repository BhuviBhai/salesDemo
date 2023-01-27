package com.sale.demo.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sale.demo.response.SalesData;
import com.sale.demo.service.SalesDataService;
import com.sale.demo.utility.TestUtility;

/*
 * list sales data via an API GET request 
 * Sort by one or more fields/attributes (e.g. /sales_data?sort=city)
 * 
 */
@RestController
@RequestMapping(value="/sales_data",produces = MediaType.APPLICATION_JSON_VALUE)
public class SalesDataController {

	@Autowired
	private SalesDataService salesDataService;

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	private List<SalesData>  getAllSelesData() {
		if(salesDataService.getAllSelesData().isEmpty()) {
			System.out.println("Data not availble");
		}
		return salesDataService.getAllSelesData();

	}

	/*
	 * Filter by one or more fields/attributes (e.g.
	 * /sales_data?sales[amt]=120000&branch=A ) 
	 */
	@GetMapping(value = "/salesAmtAndBranch",   produces = MediaType.APPLICATION_JSON_VALUE)
	private List<SalesData>  getSalesAmtAndBranchData(@RequestParam(required = true) Double amt,
			@RequestParam(required = true) String branch) {
		
		return salesDataService.getSalesAmtAndBranchData(amt,branch);

	}

	/*
	 * fetch a single record via GET request  return a sparse fieldset (e.g.
	 * /sales_data?fields=product_line,date,city) 
	 */
	@GetMapping(value = "/fields",   produces = MediaType.APPLICATION_JSON_VALUE)
	private List<SalesData>  getFieldSet(@RequestParam(required = true) String fields) throws ParseException {
		// product_line,date,city
		String[] splitData = fields.split(",");
		String product_line = splitData[0];

		Date date = TestUtility.DateFor.parse(splitData[1]);
		String city = splitData[2];
		
		return salesDataService.getFieldSetData(product_line,date,city);

	}

	/*
	 * Sort by one or more fields/attributes (e.g. /sales_data?sort=city)
	 */
	@GetMapping(value = "/sort",   produces = MediaType.APPLICATION_JSON_VALUE)
	private List<SalesData>  getAllSelesDataByCity(@RequestParam(required = true) String sort) {
		return salesDataService.getAllSelesDataByCity(sort);

	}

}
