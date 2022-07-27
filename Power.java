package com.mayank;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base Value: ");
        int a = in.nextInt();

        System.out.print("Enter Power Value: ");
        int b = in.nextInt();

        System.out.println(a+"^"+b+" = "+ (Math.pow(a,b)));
    }
}
