package SampleAssessment.TestSem2_2022.Ex1;

public class Person extends Information{
    private String fax;
    private String contactPerson;

    public Person(int id, String name, String address, String phone, String email, String fax, String contactPerson) {
        super(id, name, address, phone, email);
        this.fax = fax;
        this.contactPerson = contactPerson;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "fax='" + fax + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                '}';
    }
}
