package SampleAssessment.Sem3_2022.Ex1;

public class Truck extends Vehicle{
    private double carryLoad;

    public Truck() {
        this.carryLoad = 0;
    }

    public Truck(String VIN, String maker, String model, int year, String color, String engineSize, String fuelType, String licensePlate, Owner owner, double carryLoad) {
        super(VIN, maker, model, year, color, engineSize, fuelType, licensePlate, owner);
        this.carryLoad = carryLoad;
    }

    public double getCarryLoad() {
        return carryLoad;
    }

    public void setCarryLoad(double carryLoad) {
        this.carryLoad = carryLoad;
    }
}
