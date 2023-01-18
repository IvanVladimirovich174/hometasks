package com.ninthhometask.ninthhometask.service;

import com.ninthhometask.ninthhometask.model.Order;
import com.ninthhometask.ninthhometask.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOneOrder(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    public Order createRentalOrder(Order order) {
        order.setRentDate(LocalDateTime.now());
        order.setIsPurchased(false);
        return orderRepository.save(order);
    }

    public Order createPurchaseOrder(Order order) {
        order.setIsPurchased(true);
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}