package com.keyin.entity;

import javax.persistence.*;

@Entity
public class Aircraft {

    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "aircraft_sequence")
    private long id;
    private String type;
    private String airLineName;
    private int numberOfPassengers;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airLineName;
    }

    public void setAirlineName(String airlineName) {
        this.airLineName = airlineName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

}
