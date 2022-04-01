package com.company;
import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        // Program for yes or no
//        String a,b;
//        Scanner name= new Scanner(System.in);
//
//
//        System.out.print("Enter whether it is (Y/N) : ");
//        a=name.nextLine();
//
//        b=a.toLowerCase();
//
//        if(b.equals("y")){
//            System.out.println("HI");
//        }else if(b.equals("n")){
//            System.out.println("Yuck Fu");
//        }
//

    int[] reverse={1,2,3,4,5,6,7,9};
    for(int i=reverse.length-1;i>=0;i--){
        System.out.print(reverse[i]);
        if (i>0){
            System.out.print(",");
        }


    }



    }
}