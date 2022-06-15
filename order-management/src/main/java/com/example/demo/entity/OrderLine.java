package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderLine {
	@Id
	private String item;
	private Double price;
	private Integer quantity;
	private String eTA;
	private Status status;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String geteTA() {
		return eTA;
	}
	public void seteTA(String eTA) {
		this.eTA = eTA;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderLine [item=" + item + ", price=" + price + ", quantity=" + quantity + ", eTA=" + eTA + ", status="
				+ status + "]";
	}
	
	
	

}
