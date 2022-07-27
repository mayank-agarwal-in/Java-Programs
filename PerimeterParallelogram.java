package com.mayank;

import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
//        Perimeter Of Parallelogram
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side: ");
        int a = in.nextInt();

        System.out.print("Enter Base: ");
        int b = in.nextInt();

        int peri = 2 * ( a + b );
        System.out.println("Perimeter is "+peri);
    }
}
