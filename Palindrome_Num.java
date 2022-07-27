package com.mayank;

import java.util.Scanner;

public class Palindrome_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int original = n;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int rem = n%10;
            sum = sum*10 + rem;
            n/=10;
        }

        if (original == sum){
            System.out.println(original + " is a Palindrome Number");
        }else {
            System.out.println(original + " is not a Palindrome Number");
        }

    }
}
