package com.example.dbset.repository;

import com.example.dbset.entity.Trains;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainsRepository extends MongoRepository<Trains,String> {

}
