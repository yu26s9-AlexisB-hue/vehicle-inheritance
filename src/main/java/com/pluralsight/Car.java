package com.pluralsight;

public class Car extends Vehicle{
    private int numberOfDoors;
    private boolean isElectric;
    private boolean hasSunroof;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfDoors, boolean isElectric, boolean hasSunroof) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
        this.hasSunroof = hasSunroof;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }
}
