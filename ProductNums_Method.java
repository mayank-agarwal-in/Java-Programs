//Define a method that returns the product of two numbers entered by user.
package com.mayank;

import java.util.Scanner;

public class ProductNums_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = in.nextInt();
        System.out.print("Enter second num: ");
        int b = in.nextInt();

        int ans = product(a,b);
        System.out.println("Product is "+ans);
    }

    static int product(int a, int b){
        return a*b;
    }
}
