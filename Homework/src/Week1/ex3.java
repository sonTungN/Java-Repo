package Week1;

public class ex3 {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        int count = 0;
        for(int i = 100; i < 201; i++){
            if(check(i)){
                System.out.print(i + " ");
                count++;
            }
            if(count % 10 == 0 && count != 0){
                System.out.println();
                count = 0;
            }
        }
    }
    public static boolean check(int num){
        if(num % 5 == 0 && num % 6 == 0){
            return false;
        } else if (num % 5 != 0 && num % 6 != 0){
            return false;
        }
        return true;
    }
}
