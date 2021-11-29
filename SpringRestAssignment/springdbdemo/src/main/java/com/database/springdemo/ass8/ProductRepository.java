package com.database.springdemo.ass8;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Products,Integer> {

}
