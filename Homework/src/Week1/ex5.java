package Week1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = sc.nextInt();
        while(line < 1 || line > 15){
            System.out.print("Enter the number of lines: ");
            line = sc.nextInt();
        }
        print(line);
    }
    public static void print(int line){
        for(int row = 1; row <= line; row++) {
            for(int i = 0; i < 4; i++){
                System.out.printf("\t");
            }
            for (int i = line - row; i > 0; i--) {
                System.out.print("    ");
            }
            for (int i = row; i > 0; i--) {
                System.out.printf("%2d  ", i);
            }
            for (int i = 2; i <= row; i++) {
                System.out.printf("%2d  ", i);
            }
            System.out.println();
        }
    }
}
