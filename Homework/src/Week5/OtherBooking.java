package Week5;

public class OtherBooking extends Booking implements Taxable{
    private static final double MAX_PERCENT = 0.11;
    private static final double TAX_PERCENT = 0.15;

    @Override
    public double bookingSum(){
        double sum = super.bookingSum();
        double tip = sum * (Math.random() * MAX_PERCENT);
        double discount = (getDiscount() == null) ? sum : getDiscount().calculateDiscountedAmount(sum);
        return discount + tip;
    }

    @Override
    public double calculateTax(){
        return super.bookingSum() * TAX_PERCENT;
    }
}
