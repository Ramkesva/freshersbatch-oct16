package com.database.springdbdemo.ass7;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Orders, Integer> {

}
