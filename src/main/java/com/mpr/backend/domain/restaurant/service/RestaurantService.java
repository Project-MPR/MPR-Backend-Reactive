package com.mpr.backend.domain.restaurant.service;

import com.mpr.backend.domain.restaurant.Restaurant;
import com.mpr.backend.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public Flux<Restaurant> findRestaurantByStation(String station) {
        return restaurantRepository.findByStation(station);
    }
}
