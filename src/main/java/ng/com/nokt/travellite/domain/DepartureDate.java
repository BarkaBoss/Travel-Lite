package ng.com.nokt.travellite.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class DepartureDate {

    @Id
    private Long id;

    @NotNull
    private Date departureDate;
}
