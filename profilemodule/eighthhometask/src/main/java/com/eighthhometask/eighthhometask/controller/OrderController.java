package com.eighthhometask.eighthhometask.controller;

import com.eighthhometask.eighthhometask.model.Order;
import com.eighthhometask.eighthhometask.repository.OrderRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/order")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @ApiOperation(value = "Получить список всех заказов")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Order> list() {
        return orderRepository.findAll();
    }

    @ApiOperation(value = "Получить заказ по Id")
    @GetMapping(value = "/{id}")
    public Order getById(@PathVariable Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @ApiOperation(value = "Добавить заказ")
    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @ApiOperation(value = "Обновить информацию о заказе по Id")
    @PutMapping("/{id}")
    public Order update(@RequestBody Order order, @PathVariable Long id) {
        order.setId(id);
        return orderRepository.save(order);
    }

    @ApiOperation(value = "Удалить информацию о заказе по Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }
}