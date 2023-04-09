package Week5;

public class SpecialEventDiscount extends Discount{
    private int value;

    public SpecialEventDiscount(String code, int value) {
        super(code);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public double calculateDiscountedAmount(double sum){
        if(value > sum){
            return 0;
        }
        double discount1 = sum - value;
        double discount2 = sum * (100 - value) / 100;
        return Math.min(discount1, discount2);
    }
}
