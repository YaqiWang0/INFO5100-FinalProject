package dao;

import java.io.Serializable;
import java.util.Collection;

public class Dealers implements Serializable {
    private String id;
    private String url;
    private String location;
    private Collection<Vehicle> vehicles;
    private Collection<Special> specials;

    public Dealers(String id, String url, String location) {
        this.id = id;
        this.url = url;
        this.location = location;
    }

    //getter

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getLocation() {
        return location;
    }

    public Collection<Vehicle> getVehicles() {
        return vehicles;
    }

    public Collection<Special> getSpecials() {
        return specials;
    }

    //setter

    public void setId(String id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setVehicles(Collection<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void setSpecials(Collection<Special> specials) {
        this.specials = specials;
    }
}
