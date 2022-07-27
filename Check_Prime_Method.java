//Define a method to find out if a number is prime or not.
package com.mayank;

import java.util.Scanner;

public class Check_Prime_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        if (isPrime(n)){
            System.out.println(n+" is a prime number");
        }else {
            System.out.println(n+" is not a prime number");
        }
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
