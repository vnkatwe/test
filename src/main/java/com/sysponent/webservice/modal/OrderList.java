package com.sysponent.webservice.modal;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="orderList")
public class OrderList {

	private List<Order> orderList;

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
}
