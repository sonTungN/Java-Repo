package SampleAssessment.TestSem2_2022.Ex1;

import java.util.Date;

public class SaleInvoice extends Note{
    private java.util.Date dateDelivered;
    private Staff saleStaff;
    private Person customer;
    private double totalValue;

    public SaleInvoice(int id, Product product, int quantity, double price, Date dateDelivered, Staff saleStaff, Person customer) {
        super(id, product, quantity, price);
        this.dateDelivered = dateDelivered;
        this.saleStaff = saleStaff;
        this.customer = customer;
    }

    public Date getDateDelivered() {
        return dateDelivered;
    }

    public void setDateDelivered(Date dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public Staff getSaleStaff() {
        return saleStaff;
    }

    public void setSaleStaff(Staff saleStaff) {
        this.saleStaff = saleStaff;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public double getTotalValue() {
        return getPrice() * getQuantity();
    }


    @Override
    public void display(){
        super.display();
        System.out.println("Date delivered: " + dateDelivered);
        System.out.println("Sale staff: " + saleStaff);
        System.out.println("Customer: " + customer);
        System.out.println("TotalValue: " + getTotalValue());
    }
}
