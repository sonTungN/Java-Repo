package SampleAssessment.Sem3_2022.Ex1;

public class Motorcycle extends Vehicle{
    private int wheelNumber;

    public Motorcycle() {
        this.wheelNumber = 0;
    }

    public Motorcycle(String VIN, String maker, String model, int year, String color, String engineSize, String fuelType, String licensePlate, Owner owner, int wheelNumber) {
        super(VIN, maker, model, year, color, engineSize, fuelType, licensePlate, owner);
        this.wheelNumber = wheelNumber;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }
}
