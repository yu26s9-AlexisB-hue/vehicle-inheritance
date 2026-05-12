package com.pluralsight;

public class Hovercraft extends Vehicle{
    private double hoverHeight;
    private String terrainType;
    private boolean amphibious;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double hoverHeight, String terrainType, boolean amphibious) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hoverHeight = hoverHeight;
        this.terrainType = terrainType;
        this.amphibious = amphibious;
    }

    public double getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(double hoverHeight) {
        this.hoverHeight = hoverHeight;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public boolean isAmphibious() {
        return amphibious;
    }

    public void setAmphibious(boolean amphibious) {
        this.amphibious = amphibious;
    }
}
