package Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LabExercise {
    public static void main(String[] args) {
//        ex1();
//        ex4City();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();        // Not done yet
        ex7();
//        ex8();
    }
    public static void ex1(){
        /*
        Write a program that prompts the user to enter a year and a string of three characters
    for a month name (with the first letter in uppercase) then displays the number of days in
    the month. If the user enters an invalid value for year or month, print out a helpful error
    message.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        while(year < 1900 || year > 2100){
            System.out.println("Error !");
            System.out.print("Enter a year: ");
            year = sc.nextInt();
        }
        System.out.print("Enter a month: ");
        String month = sc.next();
        int day = 0;
        if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
            day = 31;
        } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")){
            day = 30;
        } else if (month.equals("Feb")){
            if(isLeap(year)){
                day = 29;
            } else {
                day = 28;
            }
        }
        System.out.println(month + " " + year + " has " + day + " days");
    }
    public static boolean isLeap(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }

    public static void ex4City(){
        /*
        Write  a  program  that  prompts  the  user  to  enter  three  cities  and  display  them  in
    ascending order.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<>();
        System.out.print("Enter the first city: ");
        city.add(sc.nextLine());
        System.out.print("Enter the second city: ");
        city.add(sc.nextLine());
        System.out.print("Enter the third city: ");
        city.add(sc.nextLine());
        Collections.sort(city);
        System.out.print("The three cities in alphabetical order are: ");
        for(String e: city){
            System.out.print(e + " ");
        }
    }

    public static void ex2(){
        /*
        Write  a  method  that  takes  a  string  and  returns  its  reverse.  For  example,  if  the  given
    string is "Good day" then the method returns "yad dooG".
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String s = "";
        for(int i = str.length() - 1; i >= 0; i--){
            s += str.charAt(i);
        }
        System.out.print("The reverse string: " + s);
    }

    public static void ex3(){
        /*
        A  palindrome  is  a  string  that  reads  the  same  backward  as  forward  when  ignoring
    punctuations,  blanks  and  case  difference.  For  example,  "madam",  "Hannah",  "Step  on
    no  pets",  "Was  it  a  car  or  a  cat  I  saw?",  "A  man,  a  plan,  a  canal,  Panama!"  are  all
    palindromes.  Write  a  method  that  checks  if  a  given  string  is  a  palindrome  or  not.  Hint:
    use the method in the last exercise.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("This is a palindrome string !");
        } else {
            System.out.println("This is not a palindrome string !");
        }
    }
    public static boolean isPalindrome(String str){
        String s = "";
        for(int i = str.length() - 1; i >= 0; i--){
            s += str.charAt(i);
        }
        s = s.replace(" ", "");
        str = str.replace(" ", "");
        return str.equals(s);
    }

    public static void ex4(){
        /*
        Write  a  program  that  determines  if  a  list  is  already  sorted  in  increasing  order.  The
    program should prompt the user to enter a list and displays whether the list is sorted in
    ascending order or not. Note that the first number in the input indicates the number of
    the elements in the list. The program exits when the first number is 0.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter list: ");
        if(length > 0) {
            int current_Value = sc.nextInt();
            boolean isSorted = true;
            for (int i = 1; i < length; i++) {
                int value = sc.nextInt();
                if(current_Value > value){
                    isSorted = false;
                    break;
                } else {
                    current_Value = value;
                }
            }
            if(isSorted){
                System.out.println("This list is already sorted ");
            } else {
                System.out.println("This list is not sorted");
            }
        }
    }

    public static void ex5(){
        /*
        Write a program that generates 100 random integers between 0 and 9 then displays the
    count for each number.
         */
        int value;
        int[] list = new int[100];
        int[] count = new int[10];
        for(int i = 0; i < list.length; i++){
            value = (int)(Math.random() * 10);
            list[i] = value;
            count[value]++;
        }
        for(int i = 0; i < count.length; i++){
            System.out.printf("%d repeats %d times\n", i, count[i]);
        }
    }

    public static void ex6(){
        /*
        Write a program that reads an unspecified number of scores in one input and
    determines  how  many  scores  are  above  or  equal  to  the  average  and  how  many  scores
    are below the average.
         */
        System.out.println("Enter scores: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner input = new Scanner(line);
        }
    }

    public static void ex7(){
        /*
        Write a program that reads in ten integers between 1 and 100 then displays the number
    of  distinct  integers  and  the  distinct  integers  separated  by  exactly  one  space  (i.e.,  if  a
    number appears multiple times, it is displayed only once).
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < 10; i++){
            list.add(sc.nextInt());
        }
        int countLoop = 0;
        int count = 0;

        for(int i = 0; i < 10; i++){
            int value = list.get(0);
            list.remove(0);
            if(!list.contains(value)){
                list.add(value);
                count++;
            }
        }
        Collections.sort(list);
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are: ");
        for(Integer e: list){
            System.out.print(e + " ");
        }
    }

    public static void ex8(){
        /*
        Write  a  program  that  reads  a  list  of  integers  between  1  and  100  then  counts  the
    occurrences  of  each.  Assume  that  the  user  always  input  value  integers  and  the  input
    always ends with 0.
         */
        Scanner sc = new Scanner(System.in);
        int[] count = new int[101];
        int value;
        while(true){
            value = sc.nextInt();
            count[value]++;
            if(value == 0){
                break;
            }
        }
        for(int i = 1; i < 101; i++){
            if(count[i] > 0){
                if(count[i] > 1){
                    System.out.println(i + " occurs " + count[i] + " times");
                } else {
                    System.out.println(i + " occurs 1 time");
                }
            }
        }
    }
}
