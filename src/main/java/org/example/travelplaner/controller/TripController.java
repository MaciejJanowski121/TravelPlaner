package org.example.travelplaner.controller;

import org.example.travelplaner.model.Trip;
import org.example.travelplaner.service.TripService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {

private final TripService tripService;

public TripController(TripService tripService) {
    this.tripService = tripService;
}

    @GetMapping("/trip/{id}")
    public ResponseEntity<Trip> getTrip(@PathVariable Long id) {
        Trip trip = tripService.getTripById(id);
        if (trip != null) {
            return ResponseEntity.ok(trip);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
