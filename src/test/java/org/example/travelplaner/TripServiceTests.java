package org.example.travelplaner;

import org.example.travelplaner.model.Trip;
import org.example.travelplaner.repository.TripRepository;
import org.example.travelplaner.service.TripService;
import org.example.travelplaner.service.impl.TripServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.example.travelplaner.model.Trip;

@ExtendWith(MockitoExtension.class)
public class TripServiceTests {

    @Mock
    TripRepository tripRepository;
    @InjectMocks
    TripServiceImpl tripService;

    @Test
    public void saveTrip() {
        Trip trip = new Trip();
        trip.setTripName("Test Trip");
        when (tripRepository.save(trip)).thenReturn(trip);
        Trip result = tripService.saveTrip(trip);
assertEquals(trip.getTripName(), result.getTripName());
verify(tripRepository).save(trip);
    }

}
