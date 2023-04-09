package Week1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Enter a positive integer: ");
            num = sc.nextInt();
            if(num < 1){
                System.out.println("Goodbye!");
                break;
            }
            check(num);
        }
    }
    public static void check(int num){
        if(num % 5 == 0 && num % 6 == 0){
            System.out.println(num + " is divisible by both 5 and 6");
        } else if (num % 5 == 0 || num % 6 == 0){
            System.out.println(num + " is divisible by 5 or 6, but not both");
        } else {
            System.out.println(num + " is neither divisible by 5 nor 6");
        }
    }
}
