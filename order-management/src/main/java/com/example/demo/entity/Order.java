package com.example.demo.entity;

import java.util.Date;

public class Order {
	private Integer totalAmount;
	private Date date;
	private Status status;
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [totalAmount=" + totalAmount + ", date=" + date + ", status=" + status + "]";
	}
	

}
