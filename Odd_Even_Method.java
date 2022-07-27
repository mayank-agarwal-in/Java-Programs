package com.mayank;

import java.util.Scanner;

public class Odd_Even_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        even_odd(n);
    }

    static void even_odd(int n){
        if (n%2==0){
            System.out.println(n+" is Even");
        }else {
            System.out.println(n+" is Odd");
        }
    }

}
