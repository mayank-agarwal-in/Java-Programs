package com.mayank;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        char op = in.next().trim().charAt(0);

        if (op == '+'){
            System.out.println(num1 + num2);
        }
        if (op == '-'){
            System.out.println(num1 - num2);
        }
        if (op == '*'){
            System.out.println(num1 * num2);
        }
        if (op == '/'){
            if (num2 != 0){
                System.out.println(num1 / num2);
            }
        }

    }
}
