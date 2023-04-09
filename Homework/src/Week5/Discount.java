package Week5;

public abstract class Discount {
    private String code;

    public Discount() {
        this.code = null;
    }

    public Discount(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public abstract double calculateDiscountedAmount(double sum);
}
