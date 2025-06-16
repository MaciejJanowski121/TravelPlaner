package org.example.travelplaner.service;


import org.example.travelplaner.model.Trip;
import java.util.List;

public interface TripService {
    Trip saveTrip(Trip trip);
    List<Trip> getAllTrips();
    Trip getTripById(Long id);
    void deleteTrip(Long id);
}