package repository;

import model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository  extends JpaRepository<Trip, Integer> {

}
