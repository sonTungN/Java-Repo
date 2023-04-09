package Week3;

import java.util.Scanner;

public class Ex4 {
    /*
    Design a class named LinearEquation for a system of 2 x 2.
    The class contains:
    • Private attributes a, b, c, d, e, and f.
    • A constructor with the arguments for a, b, c, d, e, and f.
    • Six get methods for a, b, c, d, e, and f.
    • A method isSolvable() that returns true if (ad – bc) is not 0 and false otherwise.
    • Methods getX() and getY() that return the solution for the equation.
    - Draw a class diagram for this class and then implement the class. Write a test program
    that prompts the user to enter a, b, c, d, e, and f then displays the solution. If (ad – bc) is
    0, report that "The equation has no solution."
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e ,f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        LinearEquation le = new LinearEquation(a, b, c, d, e ,f);
        if(le.isSolvable()){
            System.out.println("X = " + le.getX());
            System.out.println("Y = " + le.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}

class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}