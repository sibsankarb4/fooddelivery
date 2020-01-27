package com.ibm.food.repository;

import com.ibm.food.model.Order;
import com.ibm.food.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, Long> {

    List<Restaurant> findByPostcode(String postcode);
}
