package ng.com.nokt.travellite.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Route {

    @Id
    private Long id;

    private String routeName;
    private int cost;

    @ManyToMany
    List<DepartureDate> departureDates;

    @ManyToMany
    List<Vehicles> vehicles;

    public Route() {
    }

    public Route(String routeName, int cost, List<DepartureDate> departureDates, List<Vehicles> vehicles) {
        this.routeName = routeName;
        this.cost = cost;
        this.departureDates = departureDates;
        this.vehicles = vehicles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<DepartureDate> getDepartureDates() {
        return departureDates;
    }

    public void setDepartureDates(List<DepartureDate> departureDates) {
        this.departureDates = departureDates;
    }

    public List<Vehicles> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }
}
