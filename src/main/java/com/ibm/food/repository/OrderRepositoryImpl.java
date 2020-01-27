package com.ibm.food.repository;

import com.ibm.food.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

public class OrderRepositoryImpl implements OrderActionRepository {

    @Autowired
    MongoOperations mongoTemplate;

    @Override
    public void acceptOrder(Long orderId, String timeAccepted) {
        Order order = mongoTemplate.findById(orderId, Order.class);
        order.setTimeAccepted(timeAccepted);
        mongoTemplate.save(order);
    }

    @Override
    public void cancelOrder(Long orderId, String cancelMessage) {
        Order order = mongoTemplate.findById(orderId, Order.class);
        order.setCancelMessage(cancelMessage);
        mongoTemplate.save(order);
    }
}
