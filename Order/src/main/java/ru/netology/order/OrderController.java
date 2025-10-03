package ru.netology.order;

import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    OrderService orderService = new OrderService();
    @GetMapping("/api/orders/by-user/{user}")
    public List<Order> getByUser(@PathVariable("user") int userId) {
        return orderService.getOrders(userId);
    }
}
