package SampleAssessment.TestSem2_2022.Ex1;

import java.util.Date;

public class Order extends Note {
    private java.util.Date dateOrdered;
    private Staff staff;
    private Person provider;

    public Order(int id, Product product, int quantity, double price, Date dateOrdered, Staff staff, Person provider) {
        super(id, product, quantity, price);
        this.dateOrdered = dateOrdered;
        this.staff = staff;
        this.provider = provider;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Person getProvider() {
        return provider;
    }

    public void setProvider(Person provider) {
        this.provider = provider;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Date Ordered: " + dateOrdered);
        System.out.println("Order Staff: " + staff);
    }
}
