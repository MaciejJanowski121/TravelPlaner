package org.example.travelplaner.controller;

import org.example.travelplaner.model.Trip;
import org.example.travelplaner.service.TripService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/newTrip")
    public ResponseEntity<Trip> createTrip(@RequestBody Trip trip) {
Trip newTrip = tripService.saveTrip(trip);
return ResponseEntity.status(201).body(newTrip);

    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTrip(@PathVariable Long id) {
    tripService.deleteTrip(id);
    return ResponseEntity.noContent().build();
    }
}
