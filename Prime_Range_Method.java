//Write a function that returns all prime numbers between two given numbers.
package com.mayank;

import java.util.Scanner;

public class Prime_Range_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int a = in.nextInt();
        System.out.print("Enter ending value: ");
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int n){
        if (n<=1)
            return false;

        int c = 2;
        while (c*c<=n){
            if (n%c==0)
                return false;
            c++;
        }
        return c*c>n;
    }
}
