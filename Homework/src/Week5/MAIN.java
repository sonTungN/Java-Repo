package Week5;

public class MAIN {
    public static void main(String[] args) {
        Item i1 = new Item("No1", 900);
        Item i2 = new Item("No2", 500);
        Item i3 = new Item("No3", 300);

        int n = 5;
        Booking[] bookingList = new Booking[n];
        for(int i = 0; i < n; i++){
            double r = Math.random();
            if(r < 0.33){
                bookingList[i] = new WesternBooking();
            } else if (r < 0.66){
                bookingList[i] = new OtherBooking();
            } else {
                bookingList[i] = new SocialBooking();
            }
            bookingList[i].addItem(i1);
            bookingList[i].addItem(i2);
            bookingList[i].addItem(i3);
        }
        for(Booking e: bookingList){
            System.out.println("The total pay: " + e.bookingSum());
            System.out.println("The total tax: " + getTotalTax(e));
        }
    }
    public static double getTotalTax(Booking b){
        if(b instanceof WesternBooking){
            return ((WesternBooking)b).calculateTax();
        } else if (b instanceof OtherBooking){
            return ((OtherBooking)b).calculateTax();
        }
        return ((SocialBooking)b).calculateTax();
    }
}
