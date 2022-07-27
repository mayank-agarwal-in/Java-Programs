package com.mayank;

import java.util.Scanner;

public class Distance_Between_Points {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x-coordinate of Point 1: ");
        double x1 = in.nextDouble();

        System.out.print("Enter y-coordinate of Point 1: ");
        double y1 = in.nextDouble();

        System.out.print("Enter x-coordinate of Point 2: ");
        double x2 = in.nextDouble();

        System.out.print("Enter y-coordinate of Point 2: ");
        double y2 = in.nextDouble();

        double v1 = (x2 - x1) * (x2 - x1);
        double v2 = (y2 - y1) * (y2 - y1);

        double distance = Math.sqrt(v1 + v2);
        System.out.println("Distance = "+distance);
    }
}
