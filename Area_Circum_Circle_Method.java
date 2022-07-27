//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package com.mayank;

import java.util.Scanner;

public class Area_Circum_Circle_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = in.nextDouble();

        System.out.println("Area is "+ area(r));
        System.out.println("Circumference is "+ circum(r));
    }

    static double area(double r){
        return Math.PI*r*r;
    }

    static double circum(double r){
        return 2*Math.PI*r;
    }
}
