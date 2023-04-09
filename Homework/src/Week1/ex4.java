package Week1;

public class ex4 {
    public static void main(String[] args) {
        System.out.printf("Miles    Kilometers    |    Kilometers    Miles\n");
        for(int i = 1; i <= 10; i++){
            System.out.printf(" %2d   %10.2f       |        %2d        %.2f\n", i, i * 1.609, 15 + 5 * i, (15 + 5 * i) / 1.609);
        }
    }
}
