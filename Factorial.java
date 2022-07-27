package com.mayank;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int original = n;
        int fact = 1;
        while (n!=0){
            fact = fact * n;
            n = n - 1;
        }
        System.out.println(original+"!" + " = "+fact);
    }
}
