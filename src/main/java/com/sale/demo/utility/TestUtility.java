package com.sale.demo.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sale.demo.response.SalesData;

public class TestUtility {

	public static SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
	public static List<SalesData> salesDataList;

	public static List<SalesData> getDataFromCSV() {

		List<SalesData> salesData = new ArrayList<>();
		
 
		Path pathToFile = Paths
				.get("./src/main/resources/data.txt");
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] attributes = line.split(",");
				SalesData data = new SalesData();
 
				data.setInvoiceID(attributes[0]);
				data.setBranch(attributes[1]);
				data.setCity(attributes[2]);
				data.setCustomerType(attributes[3]);
				data.setGender(attributes[4]);
				data.setProductLine(attributes[5]);
				data.setUnitPrice(Double.parseDouble(attributes[6]));
				data.setQuantity(Integer.parseInt(attributes[7]));
				data.setTax5(Double.parseDouble(attributes[8]));
				data.setTotal(Double.parseDouble(attributes[9]));
				data.setDate(DateFor.parse(attributes[10]));
				data.setTime(attributes[11]);
				data.setPayment(attributes[12]);
				data.setCogs(Double.parseDouble(attributes[13]));
				data.setGrossIncome(Double.parseDouble(attributes[14]));
				data.setGrossMmargin(Double.parseDouble(attributes[15]));
				data.setRating(Double.parseDouble(attributes[16]));
				salesData.add(data);
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
	//	System.out.println(salesData);
		salesDataList = salesData;
		return salesData;
	}

	public static void main(String[] args) throws ParseException {
		System.out.println(getDataFromCSV().size());
	}

}
