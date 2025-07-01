package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("Choose a shape (1-3): ");

        Scanner getInput = new Scanner (System.in);
        int shape = getInput.nextInt();
        switch(shape) {
            case 1:
                System.out.print("Enter the radius: ");
                int radius = getInput.nextInt();
                System.out.printf("Area of the circle: %.2f\n", calculateCircleArea(radius));
                break;
            case 2:
                System.out.print("Enter the base: ");
                int base = getInput.nextInt();
                System.out.print("Enter the height: ");
                int height = getInput.nextInt();
                System.out.printf("Area of the triangle: %.2f\n", calculateTriangleArea(base,height));
                break;
            case 3:
                System.out.print("Enter the length: ");
                int length = getInput.nextInt();
                System.out.print("Enter the width: ");
                int width = getInput.nextInt();
                System.out.printf("Area of the rectangle: %.2f\n", calculateRectangleArea(length,width));
                break;
        }



    }

    public static double calculateCircleArea(double radius)
    {
        double PIVALUE = Math.PI;
        return PIVALUE * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height)
    {
        return base * height /2;
    }

    public static double calculateRectangleArea(double length, double width)
    {
        return length * width;
    }
}
