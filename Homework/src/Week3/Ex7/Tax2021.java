package Week3.Ex7;

public class Tax2021 {
    public static void main(String[] args) {
        final int FROM = 9000;
        final int TO = 690000;
        final int INTERVALS = 10000;
        Taxes t = new Taxes();
        printResult(t, FROM, TO, INTERVALS);
    }
    public static void printResult(Taxes t, int FROM, int TO, int INTERVALS){
        System.out.println("--------------------------------THE 2021 TAXES RESULT----------------------------------- ");
        System.out.println("INCOME     SINGLE_FILERS      MARRIED JOINTLY     MARRIED SEPARATED     HEAD OF HOUSEHOLD");
        for(int income = FROM; income < TO; income += INTERVALS){
            t.setTaxableIncome(income);
            System.out.printf("%-13d", income);
            t.setFilingStatus(Taxes.SINGLE_FILERS);
            System.out.printf("%8.2f", t.getTax());
            t.setFilingStatus(Taxes.MARRIED_FILING_JOINTLY);
            System.out.printf("%20.2f", t.getTax());
            t.setFilingStatus(Taxes.MARRIED_FILING_SEPARATELY);
            System.out.printf("%20.2f", t.getTax());
            t.setFilingStatus(Taxes.HEAD_OF_HOUSEHOLD);
            System.out.printf("%23.2f\n", t.getTax());
        }
    }
}
