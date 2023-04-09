package Week3;

import java.util.Scanner;

public class AddingCharacterIntoString {
    public static void main(String[] args) {
        //They just can implement in order
//        addingByPlus();
//        addingByStringBuffer();
        addingBySubstring();
    }
    public static void addingByPlus(){
        String str1 = "Son Tung";
        String str2 = "Nguyen ";
        System.out.println(str2 + str1);
        System.out.println(str1 + str2);
    }

    public static void addingByStringBuffer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        // StringBuffer Object for the insert(position, character) method
        StringBuffer str = new StringBuffer(input);
        str.insert(2, "k");
        System.out.println(str);
    }
    public static void addingBySubstring(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();
        System.out.print("Enter string want to add: ");
        String addingString = sc.next();
        System.out.println(input.substring(0, position) + addingString + input.substring(position));
    }
}
