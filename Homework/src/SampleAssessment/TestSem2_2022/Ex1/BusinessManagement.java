package SampleAssessment.TestSem2_2022.Ex1;

import java.util.Date;

public interface BusinessManagement {
    void listAllInventoryNoteAndSaleInvoice(Date start, Date end);

    void listAllSaleInvoiceByCustomerAndSaleStaff(Person c, Staff s, Date start, Date end);

    Person searchCustomer(String s);

    double revenueBySaleStaff(Staff s, Date start, Date end);
}
