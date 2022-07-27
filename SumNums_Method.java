//Write a program to print the sum of two numbers entered by user by defining your own method.
package com.mayank;

import java.util.Scanner;

public class SumNums_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = in.nextInt();
        System.out.print("Enter second num: ");
        int b = in.nextInt();

        int ans = sum(a,b);
        System.out.println("Sum is "+ans);
    }

    static int sum(int a, int b){
        return a+b;
    }
}
