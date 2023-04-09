package Week3.Ex7;

public class Taxes {
    public static final int SINGLE_FILERS = 0;
    public static final int MARRIED_FILING_JOINTLY = 1;
    public static final int MARRIED_FILING_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int taxableIncome;
    private int[][] incomeBracket;
    private double[] taxRate;

    public Taxes() {
        filingStatus = SINGLE_FILERS;
        int[][] incomeBracket = {
                {9950, 40525, 86375, 164925, 209425, 523600},
                {19900, 81050, 172750, 329850, 418850, 628300},
                {9950, 40525, 86375, 164925, 209425, 314150},
                {14200, 54200, 86350, 164900, 209400, 523600}
        };
        setIncomeBracket(incomeBracket);

        double[] taxRate = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
        setTaxRate(taxRate);
        taxableIncome = 0;
    }

    public int[][] getIncomeBracket() {
        return incomeBracket;
    }

    public void setIncomeBracket(int[][] incomeBracket) {
        this.incomeBracket = new int[incomeBracket.length][incomeBracket[0].length];
        for(int i = 0; i < incomeBracket.length; i++){
            for(int j = 0; j < incomeBracket[0].length; j++){
                this.incomeBracket[i][j] = incomeBracket[i][j];
            }
        }
    }

    public double[] getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double[] taxRate) {
        this.taxRate = new double[taxRate.length];
        for(int i = 0; i < taxRate.length; i++){
            this.taxRate[i] = taxRate[i];
        }
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax(){
        double tax = 0;
        double income = taxableIncome;
        for(int i = 0; i < incomeBracket.length; i++){
            if(income < incomeBracket[filingStatus][i]){
                return tax += (income * taxRate[i]);
            } else {
                income -= incomeBracket[filingStatus][i];
                tax += (incomeBracket[filingStatus][i] * taxRate[i]);
            }
        }
        return tax;
    }
}
