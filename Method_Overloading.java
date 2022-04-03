package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Method_Overloading {

    static void Alpha(){
        System.out.println("Hello World");
    }
    static void Alpha(String A){
       System.out.format("Hello World . My name is %s ",A);
    }
    public static void main(String[] args) {

        Alpha();
        System.out.println(" ");
        Scanner name=new Scanner(System.in);
        System.out.print("Enter your name please ");
        String B=name.nextLine();
        Alpha(B);
    }
}
