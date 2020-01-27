package com.ibm.food.api;

import com.ibm.food.model.Order;
import com.ibm.food.repository.OrderActionRepository;
import com.ibm.food.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/orders")
public class OrderApi {

    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/accept/{orderId}/{timeAccepted}")
    public void acceptOrder(@PathVariable(value = "orderId") Long orderId, @PathVariable(value="timeAccepted") String timeAccepted) {
        orderRepository.acceptOrder(orderId, timeAccepted);
    }

    @PostMapping("/cancel/{orderId}/{cancelMessage}")
    public void cancelOrder(@PathVariable(value = "orderId") Long orderId, @PathVariable(value="cancelMessage") String cancelMessage) {
        orderRepository.cancelOrder(orderId, cancelMessage);
    }
}
