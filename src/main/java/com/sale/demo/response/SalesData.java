package com.sale.demo.response;

import java.util.Date;
import java.util.Objects;

public class SalesData {
	
	private String invoiceID;	
	private String branch;	
	private String City;	
	private String CustomerType;	
	private String gender;	
	private String productLine;	
	private String unitPrice;	
	private String quantity;	
	private String tax5;	
	private Double total;	
	private Date date;	
	private String time;	
	private String paymentCogs;	
	private String grossMmargin ;	
	private String grossIncome ;	
	private String Rating ;
	
	
	public String getInvoiceID() {
		return invoiceID;
	}


	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getCustomerType() {
		return CustomerType;
	}


	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getProductLine() {
		return productLine;
	}


	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}


	public String getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getTax5() {
		return tax5;
	}


	public void setTax5(String tax5) {
		this.tax5 = tax5;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getPaymentCogs() {
		return paymentCogs;
	}


	public void setPaymentCogs(String paymentCogs) {
		this.paymentCogs = paymentCogs;
	}


	public String getGrossMmargin() {
		return grossMmargin;
	}


	public void setGrossMmargin(String grossMmargin) {
		this.grossMmargin = grossMmargin;
	}


	public String getGrossIncome() {
		return grossIncome;
	}


	public void setGrossIncome(String grossIncome) {
		this.grossIncome = grossIncome;
	}


	public String getRating() {
		return Rating;
	}


	public void setRating(String rating) {
		Rating = rating;
	}


	@Override
	public int hashCode() {
		return Objects.hash(City, CustomerType, Rating, branch, date, gender, grossIncome, grossMmargin, invoiceID,
				paymentCogs, productLine, quantity, tax5, time, total, unitPrice);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesData other = (SalesData) obj;
		return Objects.equals(City, other.City) && Objects.equals(CustomerType, other.CustomerType)
				&& Objects.equals(Rating, other.Rating) && Objects.equals(branch, other.branch)
				&& Objects.equals(date, other.date) && Objects.equals(gender, other.gender)
				&& Objects.equals(grossIncome, other.grossIncome) && Objects.equals(grossMmargin, other.grossMmargin)
				&& Objects.equals(invoiceID, other.invoiceID) && Objects.equals(paymentCogs, other.paymentCogs)
				&& Objects.equals(productLine, other.productLine) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(tax5, other.tax5) && Objects.equals(time, other.time)
				&& Objects.equals(total, other.total) && Objects.equals(unitPrice, other.unitPrice);
	}


	@Override
	public String toString() {
		return "SalesData [branch=" + branch + ", City=" + City + ", CustomerType=" + CustomerType + ", date=" + date
				+ ", gender=" + gender + ", grossIncome=" + grossIncome + ", grossMmargin=" + grossMmargin
				+ ", invoiceID=" + invoiceID + ", paymentCogs=" + paymentCogs + ", productLine=" + productLine
				+ ", quantity=" + quantity + ", Rating=" + Rating + ", tax5=" + tax5 + ", time=" + time + ", total="
				+ total + ", unitPrice=" + unitPrice + "]";
	}
	 
}
