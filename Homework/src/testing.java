import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i = 0;
        while(name.charAt(i) != ' '){
            i++;
        }
        System.out.println(name.substring(0, i));
    }
}
