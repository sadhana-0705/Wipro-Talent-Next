package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    private String modelName;
    private String regNo;
    private String ownerName;
    private int currentSpeed;

    public Hero(String modelName, String regNo, String ownerName, int currentSpeed) {
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

    public int getSpeed() {
        return currentSpeed;
    }

    public void radio() {
        System.out.println("Hero Radio: Controlling the FM radio device frequency.");
    }
}
