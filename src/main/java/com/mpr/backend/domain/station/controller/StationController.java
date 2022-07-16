package com.mpr.backend.domain.station.controller;

import com.mpr.backend.domain.station.dto.StationDto;
import com.mpr.backend.domain.station.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class StationController {
    private final StationService stationService;

    @CrossOrigin
    @GetMapping("/api/stations")
    public Flux<StationDto> findStations(){
        return stationService.findAll();
    }
}
