package org.example.travelplaner.service.impl;



import org.example.travelplaner.service.TripService;
import org.example.travelplaner.model.Trip;
import org.example.travelplaner.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {

    private final TripRepository tripRepository;

    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    @Override
    public Trip getTripById(Long id) {
        return tripRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTrip(Long id) {
        tripRepository.deleteById(id);
    }
}