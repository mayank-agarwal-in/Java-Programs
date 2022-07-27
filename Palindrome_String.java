package com.mayank;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String value: ");
        String s = in.next();

        String str = "";
        for (int i = 0; i < s.length(); i++) {
                str = s.charAt(i) + str ;
        }
        System.out.println("reverse is: "+str);
         if (s.equals(str)){
             System.out.println("Palindrome");
         }
         else {
             System.out.println("Not a Palindrome");
         }
    }
}
