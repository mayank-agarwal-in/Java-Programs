package com.mayank;

import java.util.Scanner;

public class Palindrome_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (paldrm(n))
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome number");
    }

    static boolean paldrm(int n){
        int original = n;
        int sum = 0;
        while (n!=0){
            int rem = n%10;
            sum = sum*10 + rem;
            n/=10;
        }
        return sum == original;
    }
}
