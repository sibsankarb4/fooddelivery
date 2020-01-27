package com.ibm.food.repository;

import com.ibm.food.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderActionRepository {

    public void acceptOrder(Long orderId, String timeAccepted);

    public void cancelOrder(Long orderId, String cancelMessage);


}
