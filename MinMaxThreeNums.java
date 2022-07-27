//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package com.mayank;

import java.util.Scanner;

public class MinMaxThreeNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = in.nextInt();
        System.out.print("Enter 3rd num: ");
        int c = in.nextInt();

        int minimum = min(a,b,c);
        int maximum = max(a,b,c);
        System.out.println("Minimum is "+minimum);
        System.out.println("Maximum is "+maximum);
    }

    static int max(int a, int b, int c){

        int ma = a;
        if (b>ma){
            ma=b;
        }

        if(c>ma){
            ma = c;
        }

        return ma;
    }

    static int min(int a, int b, int c){

        int mi = a;
        if (b<mi){
            mi=b;
        }

        if(c<mi){
            mi = c;
        }

        return mi;
    }
}
