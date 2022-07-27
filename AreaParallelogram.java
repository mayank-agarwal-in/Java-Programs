package com.mayank;

import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
//        Area Of Parallelogram
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int b = in.nextInt();

        System.out.print("Enter Height: ");
        int h = in.nextInt();

        double area = b * h;
        System.out.println("Area is "+area);
    }
}
