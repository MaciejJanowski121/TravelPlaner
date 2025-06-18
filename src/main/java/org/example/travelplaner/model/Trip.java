package org.example.travelplaner.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

// Lombok Annotations  (Constructor with and without args and Data means Getter/Setter)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@Entity
public class Trip {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String tripName;
    private String country;
    private String capitalCity;
    private String currency;
    private String weatherDescription;
    private Double latitude;
    private Double longitude;
    private LocalDate travelDate;
    @Column(length = 1000)
    private String notes;
}
