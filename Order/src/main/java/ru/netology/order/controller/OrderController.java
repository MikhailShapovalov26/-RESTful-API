package ru.netology.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.order.model.Order;
import ru.netology.order.service.OrderService;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService ;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders/by-user/{user}")
    public List<Order> getByUser(@PathVariable("user") int userId) {
        return orderService.getOrders(userId);
    }
}
