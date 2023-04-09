package SampleAssessment.Sem3_2022.Ex1;

public class Car extends Vehicle{
    private int seatCapacity;

    public Car() {
        this.seatCapacity = 0;
    }

    public Car(String VIN, String maker, String model, int year, String color, String engineSize, String fuelType, String licensePlate, Owner owner, int seatCapacity) {
        super(VIN, maker, model, year, color, engineSize, fuelType, licensePlate, owner);
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
}
