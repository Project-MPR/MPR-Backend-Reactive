package com.mpr.backend.domain.restaurant.repository;

import com.mpr.backend.domain.restaurant.Restaurant;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
@EnableReactiveMongoRepositories
public interface RestaurantRepository extends ReactiveMongoRepository<Restaurant, Long> {
    Flux<Restaurant> findByStation(String station);
}
