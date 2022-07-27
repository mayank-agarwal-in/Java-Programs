package com.mayank;

import java.util.Scanner;

public class Subtract_Product_Sum_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int n1 = n;
        int n2 = n;

        int remainder1,remainder2,product=1, sum = 0;
        while (n1!=0){
            remainder1 = n1 % 10;
            sum+=remainder1;
            n1/=10;
        }

        System.out.println("Sum is: "+ sum);

        while (n2!=0){
            remainder2 = n2 % 10;
            product*=remainder2;
            n2/=10;
        }

        System.out.println("Product is: "+ product);


        System.out.println("Differebce between Product and Sum is "+ (product - sum));

    }
}
