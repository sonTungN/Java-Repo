package SampleAssessment.Sem3_2022.Ex1;

public class Organisation extends Owner{
    private Person representative;

    public Organisation() {
        this.representative = null;
    }

    public Organisation(String name, String phone, String email, String address, Vehicle vehicle, Person representative) {
        super(name, phone, email, address, vehicle);
        this.representative = representative;
    }

    public Person getRepresentative() {
        return representative;
    }

    public void setRepresentative(Person representative) {
        this.representative = representative;
    }
}
