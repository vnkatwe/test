package com.sysponent.webservice.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.sysponent.webservice.modal.Order;

public interface OrderService {

	public Response getOrderById(String Id);

	public Response addOrder(Order order, @Context HttpServletRequest request);
}
