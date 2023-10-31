package ng.com.nokt.travellite.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "ride")
public class Ride {

    @Id
    private Long ride;
}
