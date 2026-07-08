package com.wipro.automobile.ship; // Matches the required training platform package structure

public class compartment {
    // 3 attributes representing the physical ship cabin dimensions
    private double height;
    private double width;
    private double breadth;

    // Parameterized Constructor matching variables
    public compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getters and Setters
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getBreadth() { return breadth; }
    public void setBreadth(double breadth) { this.breadth = breadth; }

    // Display helper method
    public void printDimensions() {
        System.out.println("Ship Compartment Specs -> Height: " + height + ", Width: " + width + ", Breadth: " + breadth);
    }
}
