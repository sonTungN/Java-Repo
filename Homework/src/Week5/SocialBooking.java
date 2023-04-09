package Week5;

public class SocialBooking extends Booking implements Taxable{
    private static final double TIP_PERCENT = 0.1;
    private static final double TAX_PERCENT = 0;
    @Override
    public double bookingSum(){
        double sum = super.bookingSum();
        double tip = sum * TIP_PERCENT;
        double discount = (getDiscount() == null) ? sum : getDiscount().calculateDiscountedAmount(sum);
        return discount + tip;
    }

    @Override
    public double calculateTax(){
        return super.bookingSum() * TAX_PERCENT;
    }
}
