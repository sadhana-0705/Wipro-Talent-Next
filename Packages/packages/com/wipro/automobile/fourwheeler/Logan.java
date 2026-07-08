package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
    private String modelName;
    private String regNo;
    private String ownerName;
    private int currentSpeed;

    public Logan(String modelName, String regNo, String ownerName, int currentSpeed) {
        this.modelName = modelName;
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String getModelName() { return modelName; }

    @Override
    public String getRegistrationNumber() { return regNo; }

    @Override
    public String getOwnerName() { return ownerName; }

    // Note: Prompt specifies 'speed()' rather than 'getSpeed()' for four-wheelers
    public int speed() {
        return currentSpeed;
    }

    public int gps() {
        System.out.println("Logan GPS: Satellite tracking and route navigation active.");
        return 1; // Returns control status signal code
    }
}
