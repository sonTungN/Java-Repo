package Week5;

public class PercentOffDiscount extends Discount{
    private double amount;

    public PercentOffDiscount(String code, double amount) {
        super(code);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateDiscountedAmount(double sum){
        return sum * (100 - amount) / 100;
    }
}
