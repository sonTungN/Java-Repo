package Week1;

import java.util.Scanner;

public class RockPaperScissorUntil3 {
    public static void main(String[] args) {
        //RockPaperScissor until computer wins more than 3 times the players
        //1. Rock   2. Paper    3. Scissors
        Scanner scan = new Scanner(System.in);
        System.out.println("As 1. Rock, 2. Paper, 3. Scissors");
        int comWin = 0;
        int pWin = 0;
        while(true){
            int result = (int)(Math.random() * 3);
            System.out.print("Your choice: ");
            int choice = scan.nextInt();
            switch(choice) {
                case 1: //Rock
                    if (result == 1) {
                        System.out.println("DRAW");
                    } else if (result == 2) {
                        System.out.println("LOSE");
                        comWin++;
                    } else {
                        System.out.println("WIN");
                        pWin++;
                    }
                    System.out.printf("pWin = %d\n", pWin);
                    System.out.printf("comWin = %d\n", comWin);
                    break;

                case 2: //Paper
                    if (result == 1) {
                        System.out.println("WIN");
                        pWin++;
                    } else if (result == 2) {
                        System.out.println("DRAW");
                    } else {
                        System.out.println("LOSE");
                        comWin++;
                    }
                    System.out.printf("pWin = %d\n", pWin);
                    System.out.printf("comWin = %d\n", comWin);
                    break;

                case 3: //Scissors
                    if (result == 1) {
                        System.out.println("LOSE");
                        comWin++;
                    } else if (result == 2) {
                        System.out.println("WIN");
                        pWin++;
                    } else {
                        System.out.println("DRAW");
                    }
                    System.out.printf("pWin = %d\n", pWin);
                    System.out.printf("comWin = %d\n", comWin);
            }
            if(comWin != 0 && pWin != 0 && comWin > 3 * pWin){
                System.out.println("End game !");
                break;
            }
        }
    }
}
