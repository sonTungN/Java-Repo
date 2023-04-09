package SampleAssessment.Sem3_2022.Ex1;

import java.util.Date;

public interface VehicleManagement {
    boolean registerVehicle(Vehicle v, Date dateRegistered);

    Vehicle searchVehicle(Vehicle v);

    void displayAll();

    boolean changeOwnership(Vehicle v, Owner currentOwner, Owner newOwner, Date dateRegistered);
}
