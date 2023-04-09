package SampleAssessment.Sem3_2022.Ex1;

import java.util.ArrayList;
import java.util.Date;

public class DMVSystem implements VehicleManagement {
    private ArrayList<Vehicle> vehicle;

    public DMVSystem() {
        this.vehicle = new ArrayList<>();
    }

    public DMVSystem(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean registerVehicle(Vehicle v, Date dateRegistered) {
        if (vehicle.contains(v)) {
            System.out.println("Vehicle had had an owner !");
            return false;
        } else {
            v.setDateRegistered(dateRegistered);
            vehicle.add(v);
            return true;
        }
    }

    @Override
    public Vehicle searchVehicle(Vehicle v) {
        if (vehicle.contains(v)) {
            System.out.println("Found !");
            return v;
        } else {
            System.out.println("No result");
            return null;
        }
    }

    @Override
    public void displayAll() {
        for (Vehicle v : vehicle) {
            System.out.println(v);
        }
    }

    @Override
    public boolean changeOwnership(Vehicle v, Owner currentOwner, Owner newOwner, Date dateRegistered) {
        if (!vehicle.contains(v)) {
            System.out.println("The vehicle is not in the system !");
            return false;
        } else {
            v.setDateRegistered(dateRegistered);
            v.setOwner(newOwner);
            currentOwner.setVehicle(null);
            newOwner.setVehicle(v);
            return true;
        }
    }
}
