package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int[] list = input();
        Arrays.sort(list);
        System.out.print("The ascending order: ");
        print(list);
    }
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Enter number: ");
            num[i] = sc.nextInt();
        }
        return num;
    }
    public static void print(int[] list){
        for(int i = 0; i  < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
