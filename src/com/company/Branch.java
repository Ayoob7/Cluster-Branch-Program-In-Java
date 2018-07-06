package com.company;

public class Branch {
    //Instance Variables
    private double lat;
    private double longi;

    //Constructors
    public Branch(double lat, double longi) {
        this.setLat(lat);
        this.setLongi(longi);
    }

    //Getters and Setters
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }
}
