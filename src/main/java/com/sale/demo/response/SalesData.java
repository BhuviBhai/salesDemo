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
	private Double unitPrice;	
	private Integer quantity;	
	private Double tax5;	
	private Double total;	
	private Date date;	
	private String time;	
	private String payment;	
	private Double cogs;	
	private Double grossMmargin ;	
	private Double grossIncome ;	
	private Double Rating ;
	
	
	public String getPayment() {
		return payment;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}


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

 

	public Double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getTax5() {
		return tax5;
	}


	public void setTax5(Double tax5) {
		this.tax5 = tax5;
	}


	public Double getCogs() {
		return cogs;
	}


	public void setCogs(Double cogs) {
		this.cogs = cogs;
	}


	public Double getGrossMmargin() {
		return grossMmargin;
	}


	public void setGrossMmargin(Double grossMmargin) {
		this.grossMmargin = grossMmargin;
	}


	public Double getGrossIncome() {
		return grossIncome;
	}


	public void setGrossIncome(Double grossIncome) {
		this.grossIncome = grossIncome;
	}


	public Double getRating() {
		return Rating;
	}


	public void setRating(Double rating) {
		Rating = rating;
	}


	@Override
	public String toString() {
		return "SalesData [invoiceID=" + invoiceID + ", branch=" + branch + ", City=" + City + ", CustomerType="
				+ CustomerType + ", gender=" + gender + ", productLine=" + productLine + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + ", tax5=" + tax5 + ", total=" + total + ", date=" + date + ", time=" + time
				+ ", payment=" + payment + ", cogs=" + cogs + ", grossMmargin=" + grossMmargin + ", grossIncome="
				+ grossIncome + ", Rating=" + Rating + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(City, CustomerType, Rating, branch, cogs, date, gender, grossIncome, grossMmargin,
				invoiceID, payment, productLine, quantity, tax5, time, total, unitPrice);
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
				&& Objects.equals(cogs, other.cogs) && Objects.equals(date, other.date)
				&& Objects.equals(gender, other.gender) && Objects.equals(grossIncome, other.grossIncome)
				&& Objects.equals(grossMmargin, other.grossMmargin) && Objects.equals(invoiceID, other.invoiceID)
				&& Objects.equals(payment, other.payment) && Objects.equals(productLine, other.productLine)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(tax5, other.tax5)
				&& Objects.equals(time, other.time) && Objects.equals(total, other.total)
				&& Objects.equals(unitPrice, other.unitPrice);
	}

 
	 
}
