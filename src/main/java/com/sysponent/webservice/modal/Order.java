package com.sysponent.webservice.modal;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="order")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Order implements Serializable{

	private String orderId;

	private Integer quantity;

	private String paymentStatus;

	private double bookingAmount;
	
	private List<Inventory> invList;
	
	public List<Inventory> getInvList() {
		return invList;
	}

	public void setInvList(List<Inventory> invList) {
		this.invList = invList;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

}
