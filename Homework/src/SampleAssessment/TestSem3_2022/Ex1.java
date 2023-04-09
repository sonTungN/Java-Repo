package SampleAssessment.TestSem3_2022;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days? ");
        int day = sc.nextInt();
        while(day < 0 || day > 31){
            System.out.println("The number of working days cannot be negative.");
            System.out.print("How many days? ");
            day = sc.nextInt();
        }
        payCheck(day);
    }
    public static void payCheck(int day) {
        int total = 0;
        int upRate = 2;
        int centPerDay;
        for(int i = 1; i <= day; i++){
            centPerDay = (int)(Math.pow(upRate, i - 1));
            System.out.println("Pay for day " + i + " = " + centPerDay);
            total += centPerDay;
        }
        System.out.println();
        System.out.printf("Total pay is $%.2f", exchangeToDollar(total));
    }
    public static double exchangeToDollar(int total){
        return (total / 100) + (total % 100) / 100.0;
    }
}
