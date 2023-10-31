package ng.com.nokt.travellite.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicles {

    @Id
    private Long id;

    private String vehicleType;

    private int numberOfSeats;

    private String plateNumber;

    private boolean available;

    private int numberOfRows;
    private int numberOfColumns;
}
