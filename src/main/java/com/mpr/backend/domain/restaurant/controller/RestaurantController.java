package com.mpr.backend.domain.restaurant.controller;

import com.mpr.backend.domain.restaurant.dto.RestaurantDto;
import com.mpr.backend.domain.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;
    private final ModelMapper modelMapper;

    @CrossOrigin
    @GetMapping("/api/restaurant/{station}")
    public Flux<RestaurantDto> findByStation(@PathVariable("station") String station) {
        return restaurantService.findRestaurantByStation(station)
                .map(restaurant -> {
                    return modelMapper.map(restaurant, RestaurantDto.class);
                });
    }
}
