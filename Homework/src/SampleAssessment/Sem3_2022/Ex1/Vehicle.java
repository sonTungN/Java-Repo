package SampleAssessment.Sem3_2022.Ex1;

import java.util.Date;

public class Vehicle {
    private String VIN;
    private String maker;
    private String model;
    private int year;
    private String color;
    private String engineSize;
    private String fuelType;
    private String licensePlate;
    private Owner owner;
    private java.util.Date dateRegistered;

    public Vehicle() {
        this.VIN = null;
        this.maker = null;
        this.model = null;
        this.year = 0;
        this.color = null;
        this.engineSize = null;
        this.fuelType = null;
        this.licensePlate = null;
        this.owner = null;
    }

    public Vehicle(String VIN, String maker, String model, int year, String color, String engineSize, String fuelType, String licensePlate, Owner owner) {
        this.VIN = VIN;
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    public Date getDateRegistered() {
        return new Date();
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Day Register: " + getDateRegistered() +
                "\nVehicle{" +
                "VIN='" + VIN + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", owner=" + owner +
                '}';
    }
}
