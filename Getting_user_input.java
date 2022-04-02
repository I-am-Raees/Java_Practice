package com.company;
import java.util.Scanner;



public class Getting_user_input {
    public static void main(String[] args) {
        // Creating the scanner method in the class
        Scanner Numbers=new Scanner(System.in);
        // Printing on the screen
        System.out.println("              Taking the user input is very simple and is as below      ");
        //User inputs are as below
        System.out.print("Enter the first number :");
        int a=Numbers.nextInt();
        System.out.print("Enter the second number :");
        int b=Numbers.nextInt();
        System.out.print("Sum of the numbers is as below :");
        int Sum=a+b;
        System.out.println(Sum);




    }

}
