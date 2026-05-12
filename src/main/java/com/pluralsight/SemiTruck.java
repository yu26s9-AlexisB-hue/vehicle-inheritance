package com.pluralsight;

public class SemiTruck extends Vehicle{
    private double towingCapacity;
    private int numberOfAxles;
    private boolean hasTrailerAttached;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double towingCapacity, int numberOfAxles, boolean hasTrailerAttached) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.towingCapacity = towingCapacity;
        this.numberOfAxles = numberOfAxles;
        this.hasTrailerAttached = hasTrailerAttached;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public boolean isHasTrailerAttached() {
        return hasTrailerAttached;
    }

    public void setHasTrailerAttached(boolean hasTrailerAttached) {
        this.hasTrailerAttached = hasTrailerAttached;
    }
}
