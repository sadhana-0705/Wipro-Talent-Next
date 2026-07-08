package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
    private String modelName;
    private String regNo;
    private String ownerName;
    private int currentSpeed;

    public Ford(String modelName, String regNo, String ownerName, int currentSpeed) {
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

    public int speed() {
        return currentSpeed;
    }

    public int tempControl() {
        System.out.println("Ford AC: Air conditioner climate temperature adjustments initialized.");
        return 22; // Returns target AC temperature
    }
}
