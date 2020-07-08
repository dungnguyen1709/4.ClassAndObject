package Xay_dung_lop_hcn;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a width : ");
        double width  = sc.nextDouble();
        System.out.println(" Enter a height : ");
        double height = sc.nextDouble();

        RectangularLayer rectangle = new RectangularLayer(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

    }
}
