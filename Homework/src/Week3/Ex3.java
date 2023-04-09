package Week3;

import java.util.Scanner;

public class Ex3 {
    /*
    - Quadratic Equation Solving Problems
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() == 0) {
            System.out.println("x = " + qe.getRoot1());
        } else if (qe.getDiscriminant() > 0) {
            System.out.println("The equation has 2 roots: ");
            System.out.println("x1 = " + qe.getRoot1());
            System.out.println("x2 = " + qe.getRoot2());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getDiscriminant() {
        return (b * b) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
