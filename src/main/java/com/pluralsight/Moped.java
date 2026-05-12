package com.pluralsight;

public class Moped extends Vehicle {
   private  double engineCC;
   private boolean hasPedals;
   private double fuelEfficiency;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double engineCC, boolean hasPedals, double fuelEfficiency) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.engineCC = engineCC;
        this.hasPedals = hasPedals;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(double engineCC) {
        this.engineCC = engineCC;
    }

    public boolean isHasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
}
