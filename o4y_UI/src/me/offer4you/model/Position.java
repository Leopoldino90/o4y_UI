package me.offer4you.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Position implements Serializable {
    private static final long serialVersionUID = 1L;
    private double latitude;
    private double longitude;
    private Address address;

    public Position() { }

    public Position(double latitude, double longitude, Address address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}