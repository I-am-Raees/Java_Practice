package com.company;

import java.util.Scanner;


public class Prob_set_1 {
    public static void main(String[] args) {

    //Takes input from the user and prints HI and your name
        Scanner name=new Scanner(System.in);
        String Your_name;
        //Main function
        System.out.print("Enter your beautiful name please: ");
        Your_name=name.nextLine();
        System.out.printf("Hi ");
        System.out.print(Your_name);
        System.out.println(" How are you");
        System.out.println("Now enter the number whose validity you want to check whether it is an  int or not");


        //Validity of integer number
        System.out.println("Enter your number please");
        Scanner number=new Scanner(System.in);
        System.out.println(name.hasNextInt());





    }

}
