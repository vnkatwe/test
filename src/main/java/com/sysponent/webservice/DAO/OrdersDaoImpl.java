package com.sysponent.webservice.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sysponent.webservice.modal.Inventory;
import com.sysponent.webservice.modal.Order;

@Repository
public class OrdersDaoImpl implements OrdersDao {

	public Order getOrderById(String Id) {
		System.out.println("DAO " + Id);
		Order order = new Order();
		order.setBookingAmount(100);
		order.setOrderId("100");
		order.setPaymentStatus("SUCCESS");
		order.setQuantity(2);
		List<Inventory> list = new ArrayList<Inventory>();
		Inventory inv = null;
		for (int i = 0; i < 5; i++) {
			inv = new Inventory();
			inv.setInvId("100");
			inv.setName("INV 1");
			inv.setOrderId(order.getOrderId());
			list.add(inv);
		}
		order.setInvList(list);
		return order;
	}

}
