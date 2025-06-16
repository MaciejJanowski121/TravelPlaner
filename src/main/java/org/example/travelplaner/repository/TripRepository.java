package org.example.travelplaner.repository;

import org.example.travelplaner.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository  extends JpaRepository<Trip, Long> {

}
