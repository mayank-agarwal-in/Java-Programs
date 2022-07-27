package com.mayank;

import java.util.Scanner;

public class Permutation_Combination {

    static double fact(double a){
        if (a == 0){
            return 1;
        }else {
            return fact(a)*fact(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        double nPr = fact(n) / fact(n-r);
        double nCr = fact(n) / fact(n-r) * fact(r);

        System.out.println("Permutation nPr = "+nPr);
        System.out.println("Combination nCr = "+nPr);
    }
}
