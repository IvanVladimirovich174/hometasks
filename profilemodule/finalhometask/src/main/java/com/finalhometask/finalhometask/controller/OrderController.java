package com.finalhometask.finalhometask.controller;

import com.finalhometask.finalhometask.model.Order;
import com.finalhometask.finalhometask.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ApiOperation(value = "Получить список всех заказов")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Order> list() {
        return orderService.getAllOrders();
    }

    @ApiOperation(value = "Получить заказ по Id")
    @GetMapping(value = "/{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getOneOrder(id);
    }

    @ApiOperation(value = "Добавить заказ по аренде фильма")
    @PostMapping(value = "/rental")
    public Order createRental(@RequestBody Order order) {
        return orderService.createRentalOrder(order);
    }

    @ApiOperation(value = "Добавить заказ по покупке фильма")
    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.createPurchaseOrder(order);
    }

    @ApiOperation(value = "Обновить информацию о заказе")
    @PutMapping
    public Order update(Order order) {
        return orderService.updateOrder(order);
    }

    @ApiOperation(value = "Удалить информацию о заказе по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}