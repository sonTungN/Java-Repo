package SampleAssessment.Sem3_2022.Ex1;

import java.util.Date;

public class Owner {
    private String name;
    private String phone;
    private String email;
    private String address;
    private Vehicle vehicle;

    public Owner() {
        this.name = null;
        this.phone = null;
        this.email = null;
        this.address = null;
        this.vehicle = null;
    }

    public Owner(String name, String phone, String email, String address, Vehicle vehicle) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.vehicle = vehicle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "Name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
