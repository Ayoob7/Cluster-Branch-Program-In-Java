package com.company;

public class CircularCluster implements Cluster{
    //Instance variables
    private String name;
    private double lat;
    private double longi;
    private double radius;

    //Constructors
    public CircularCluster(String name, double lat, double longi, double radius) {
        this.name = name;
        this.lat = lat;
        this.longi = longi;
        this.radius = radius;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Methods
    @Override
    public boolean isInTheCluster(Branch branch) {
        double branchLat = branch.getLat();
        double branchLongi = branch.getLongi();

        double radiusSquared = Math.pow((branchLat - this.lat),2) + Math.pow((branchLongi - this.longi),2);
        double radius = Math.sqrt(radiusSquared);
        if (radius <= this.radius){
            return true;
        }
        return false;
    }

}
