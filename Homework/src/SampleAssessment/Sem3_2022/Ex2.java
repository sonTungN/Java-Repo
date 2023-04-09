package SampleAssessment.Sem3_2022;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        String output = addSymbol(input);
        System.out.println("Output: " + output);
    }
    public static String addSymbol(String input){
        for(int i = 0; i < input.length() - 1; i++){
            if(checkCondition(input.charAt(i), input.charAt(i + 1))){
                String str1 = input.substring(0, i + 1);
                String str2 = input.substring(i + 1);
                input = str1 + "&" + str2;
            }
        }
        return input;
    }
    public static boolean checkCondition(char ch1, char ch2){
        if(Character.isLowerCase(ch1) && Character.isUpperCase(ch2)){
            return true;
        } else if (Character.isLowerCase(ch2) && Character.isUpperCase(ch1)){
            return true;
        }
        return false;
    }
}
