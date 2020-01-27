package com.ibm.food.repository;

import com.ibm.food.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long>, OrderActionRepository {

}
