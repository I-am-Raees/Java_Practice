package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Methods_Full_finalized {

     /* /Method no 1

    static void Table_of_a_number(String Alpha){
        String Beta="Y";
        if (Alpha.equals(Beta)) {
            float Name_of_table;
            int Calculation_to;
            Scanner No_1 = new Scanner(System.in);
            Scanner No_2 = new Scanner((System.in));
            System.out.print("Which table do you want to print : ");
            Name_of_table = No_1.nextInt();
            System.out.println(" ");
            System.out.print("Enter the entry up to you want to print : ");
            Calculation_to = No_2.nextInt();

            float[] Answer = new float[Calculation_to];
            System.out.println("Table is");

            for (int i = 1; i <= Calculation_to; i++) {

                Answer[i-1] = Name_of_table * i;

                System.out.printf("%f * %d = %f ", Name_of_table, i, Answer[i-1]);
                System.out.println(" ");
            }
        }
        }
*/

/*    //Method No 2 + 4

    static void Stars_Pattern(int numbers){

        for(int i=1;i<=numbers;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Do you want to reverse it . Type(Y/N) ");
        Scanner Arr=new Scanner(System.in);
        String R=Arr.nextLine();
        if (R.equals("Y")){
            for(int i=1;i<=numbers;i++){

                for (int j=numbers;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Here is your Pattern :");
        }
    }
*/

  // Method no 3














    public static void main(String[] args) {

    /* /Method No 1
        System.out.print(" Do you want to print a table. Type (Y/N) :  ");
        Scanner IN=new Scanner(System.in);
        String str= IN.nextLine();

        Table_of_a_number(str);
    */

/*      //Method no 2+4
        System.out.print("Enter the number of stars you want to print : ");
        Scanner In_2=new Scanner(System.in);
        int Ar_1= In_2.nextInt();
        Stars_Pattern(Ar_1);

*/


    }

}