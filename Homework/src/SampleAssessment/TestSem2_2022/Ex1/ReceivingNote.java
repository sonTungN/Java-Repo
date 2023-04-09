package SampleAssessment.TestSem2_2022.Ex1;

import java.util.Date;

public class ReceivingNote extends Order{
    private java.util.Date dateReceived;
    private Staff staff;

    public ReceivingNote(int id, Product product, int quantity, double price, Date dateOrdered, Staff staff, Person provider, Date dateReceived, Staff staff1) {
        super(id, product, quantity, price, dateOrdered, staff, provider);
        this.dateReceived = dateReceived;
        this.staff = staff;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    @Override
    public Staff getStaff() {
        return staff;
    }

    @Override
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Date Received: " + dateReceived);
        System.out.println("Note Staff: " + staff);
    }
}
