package com.mpr.backend.domain.station.service;

import com.mpr.backend.domain.station.dto.StationDto;
import com.mpr.backend.domain.station.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class StationService {
    private final StationRepository stationRepository;

    public Flux<StationDto> findAll() {
        return  stationRepository.findAll().map(StationDto::from);
    }
}
