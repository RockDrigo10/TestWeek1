package com.example.admin.testweek1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Admin on 8/7/2017.
 */

public class Coding {
    private static String reversed ="";
    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word for Polindrome problem: ");
        word = in.nextLine();
        polWord(word);
        ///Amstrong number
        System.out.println("Enter the number for Amstrong problem: ");
        int num;
        num = in.nextInt();
        amsNum(num);
        ///stack
        String item1;
        String item2;
        String item3;
        String item4;
        System.out.println("Enter the word1 for Stack problem: ");
        item1 = in.nextLine();
        System.out.println("Enter the word2 for Stack problem: ");
        item2 = in.nextLine();
        System.out.println("Enter the word3 for Stack problem: ");
        item3 = in.nextLine();
        System.out.println("Enter the word for Stack problem: ");
        item4 = in.nextLine();
        stackShow(item1,item2,item3,item4);
    }
    private static  void polWord(String word){
        int length = word.length();
        for(int i = length; i > 0; i--) {
            reversed += word.charAt(i-1);
        }
        if(word.compareTo(reversed) == 0) {
            System.out.println("The string " + word +" is a palindrome");
        }
        else {
            System.out.println("The string " + word + " is not a palindrome");
        }
    }
    private static void amsNum(int number)
    {
        int result = number,a,c =0 ;
        while(number>0)
        {
            a = number%10;
            number = number/10;
            c = c +( a*a*a);
        }
        if(result == c)
            System.out.println("The number "+ result +" is an armstrong number");
        else
            System.out.println("The number "+ result +" is not armstrong number");
    }
    private static void stackShow(String a, String b, String c, String d){
        Stack stack = new Stack();
        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.push(d);
        System.out.println(stack);
    }
}
