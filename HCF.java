package com.mayank;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int min;
        
        if (n1>n2) min = n2;
        else min = n1;

        int i = 1;
        int hcf = Integer.MIN_VALUE;
                
        while (i<=min){ //i<36
            if (n1%i == 0 && n2%i==0){
                hcf = i;
            }
            i++;
        }
        System.out.println("HCF = "+hcf);
    }
}
