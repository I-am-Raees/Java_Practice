package com.company;
import java.util.Scanner;
import javax.lang.model.element.VariableElement;

public class Conditionals_and_loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Please enter your age                                             : ");
        a=sc.nextInt();
        System.out.print("Enter the age in your country when you will be valid for driving  : ");
        b=sc.nextInt();
        if (a<=b){
            System.out.format("\tNo boy you cannot drive now because your age is %d now",a);
        }
        else {
            System.out.println("Ok .You are eligible for driving");
        }




    }
}
