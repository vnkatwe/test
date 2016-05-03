package com.sysponent.webservice.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.sysponent.webservice.DAO.OrdersDao;
import com.sysponent.webservice.modal.Order;

public class OrderServiceImpl implements OrderService {

	@Autowired
	OrdersDao dao;

	@GET
	
	@Path("/getOrder/{orderId}")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json", "application/x-www-form-urlencoded" })
	public Response getOrderById(@PathParam("orderId") String orderId) {
		System.out.println("getOrderById in OrderServiceImpl " + orderId);
		Order order = null;
		order = dao.getOrderById(orderId);
		// order = dao.getBook(URLDecoder.decode(name, "UTF-8"));
		if (order == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} else {
			return Response.ok(order).build();
		}
	}

	@POST
	@Path("/addOrder")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.APPLICATION_FORM_URLENCODED})
	@Consumes({ MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response addOrder(Order order,@Context HttpServletRequest request) {
		System.out.println("dsdsadasldl  ");
		/*Order order = new Order();
		order.setBookingAmount(bookingAmount);
		order.setOrderId(orderId);
		order.setPaymentStatus(paymentStatus);
		order.setQuantity(quantity);*/
		// HashDB.insertBook(bookVO);
		if (order == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		} else {
			return Response.ok(order).build();
		}

	}

}
