package com.mayank;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = in.nextInt();

//        for(int i = 1; i * i <= n; i++){
//            if (n % i == 0){
//                System.out.print(i + ", ");
//                if (i != n/i){
//                    System.out.print(n/i + ", ");
//                }
//            }
//        }

//        OR

        for(int i = 1; i<= n; i++){
            if (n % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
