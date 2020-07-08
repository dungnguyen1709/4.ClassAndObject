package Phuong_trinh_bac2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Solve the quadratic equation ");

        System.out.println(" Enter the a : ");
        double a = sc.nextDouble();
        System.out.println(" Enter the b : ");
        double b = sc.nextDouble();
        System.out.println(" Enter the c : ");
        double c = sc.nextDouble();

        Quadratic quadratic = new Quadratic(a,b,c);
        double delta = quadratic.getDiscriminant();

        if (delta > 0) {
            System.out.println(" The equation has two roots : ");
            System.out.println(" root 1 : " + quadratic.getRoot1());
            System.out.println(" root 2 : " + quadratic.getRoot2());
        } else if (delta == 0) {
            System.out.println(" The equation has one root : " + quadratic.getRoot1());
        } else {
            System.out.println(" The equation has no real root! ");
        }
    }
}
