package SampleAssessment.TestSem2_2022.Ex1;

import java.util.ArrayList;
import java.util.Date;

public class BusinessProcess implements BusinessManagement {
    ArrayList<Note> noteList;

    @Override
    public void listAllInventoryNoteAndSaleInvoice(Date start, Date end) {
        System.out.println("All the inventory note: ");
        for (Note e : noteList) {
            if (e instanceof ReceivingNote) {
                long dateReceive = ((ReceivingNote) e).getDateReceived().getTime();
                if (start.getTime() < dateReceive && dateReceive < end.getTime()) {
                    e.display();
                }
            }
        }
        for (Note e : noteList) {
            if (e instanceof SaleInvoice) {
                long dateSale = ((SaleInvoice) e).getDateDelivered().getTime();
                if (start.getTime() < dateSale && dateSale < end.getTime()) {
                    e.display();
                }
            }
        }
    }

    @Override
    public void listAllSaleInvoiceByCustomerAndSaleStaff(Person c, Staff s, Date start, Date end) {
        for (Note e : noteList) {
            if (e instanceof SaleInvoice) {
                if (((SaleInvoice) e).getCustomer() == c && ((SaleInvoice) e).getSaleStaff() == s) {
                    long dateSale = ((SaleInvoice) e).getDateDelivered().getTime();
                    if (start.getTime() < dateSale && dateSale < end.getTime()) {
                        e.display();
                    }
                }
            }
        }
    }

    @Override
    public Person searchCustomer(String s) {
        for (Note e : noteList) {
            if (e instanceof SaleInvoice) {
                Person check = ((SaleInvoice) e).getCustomer();
                String phone = check.getPhone();
                String address = check.getAddress();
                String name = check.getName();
                if (s.equals(phone) || e.equals(address) || s.equals(name)) {
                    return check;
                }
            }
        }
        return null;
    }

    @Override
    public double revenueBySaleStaff(Staff s, Date start, Date end) {
        double sum = 0;
        for (Note e : noteList) {
            if (e instanceof SaleInvoice) {
                long dateSale = ((SaleInvoice) e).getDateDelivered().getTime();
                Staff check = ((SaleInvoice) e).getSaleStaff();
                if (s == check) {
                    sum += ((SaleInvoice) e).getTotalValue();
                }
            }
        }
        return sum;
    }
}
