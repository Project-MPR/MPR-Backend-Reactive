package com.mpr.backend.domain.station.repository;


import com.mpr.backend.domain.station.Station;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableReactiveMongoRepositories
public interface StationRepository extends ReactiveMongoRepository<Station, String> {

}
