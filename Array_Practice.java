package com.company;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Practice {
    public static void main(String[] args) {
//         Prob no 1
//         In order to calculate the sum of the  given array

        int i,j,m;
        float k,sum;

        m=1;
        sum=0;

        Scanner ele=new Scanner(System.in);
        Scanner float_ele=new Scanner(System.in);

        System.out.print("How many float elements you want to add in the array :");
        i=ele.nextInt();

        float[] floating_marks=new float[i];

        for (j=0;j<=i-1;j++) {
            System.out.format("Enter the element at %d position : ",j);
            k=float_ele.nextFloat();
            floating_marks[j]=k;
            sum=sum+floating_marks[j];
        }
        System.out.print("ARRAY IS :{ ");
        for (float element :floating_marks){
            System.out.print(element);
            if(m<i){
                System.out.print(" , ");
                m++;
            }
        }
        System.out.print(" }");
        System.out.println(" ");
        System.out.format("Sum of your total array is : %f",sum);


//        //Prob no 2
//
//        int a1,i,m,c,ele,alpha,elements;
//        m=1;
//        a1=0;
//
//        Scanner input   =new Scanner(System.in);
//        Scanner Element =new Scanner(System.in);
//        Scanner choice  =new Scanner(System.in);
//
//        System.out.print("Enter the size of your  array : ");
//        ele=input.nextInt();
//
//        int [] search=new int[ele];
//
//        for (int j=0;j<=ele-1;j++){
//
//            System.out.format("Enter the Element at %d Index :",j);
//            elements=Element.nextInt();
//            search[j]=elements;
//        }
//        System.out.print("Array is : { " );
//        for (int element :search){
//            System.out.print(element);
//            if ( m<ele){
//                System.out.print(",");
//                m++;
//            }
//        }
//        System.out.println(" }");
//
//        // Searching part is as following
//
//        System.out.println("Which element you want to search in the array :");
//        c=choice.nextInt();
//        for (int k=0;k<=ele-1;k++){
//            alpha=search[k];
//            if(c==alpha){
//                System.out.println("Yes,it is present in the array ");
//                a1=a1+1;
//                break;
//            }else if( c!=alpha && k==ele-1){
//                System.out.println("No Entry Found");
//            }
//
//        }
//
//         For the strings comparison
//       int ele,j,m;
//       String ele_in_array,ch,c,alpha;
//       m=1;
//
//       Scanner input   =new Scanner(System.in);
//       Scanner Element =new Scanner(System.in);
//       Scanner choice  =new Scanner(System.in);
//
//       System.out.print("Enter the size of your  array : ");
//       ele=input.nextInt();
//
//       String [] search=new String[ele];
//
//       for (j=0;j<=ele-1;j++){
//
//           System.out.format("Enter the Element at %d Index :",j);
//           ele_in_array=Element.nextLine();
//           search[j]=ele_in_array;
//       }
//       System.out.print("Array is : { " );
//       for (String element :search){
//           System.out.print(element);
//           if ( m<ele){
//               System.out.print(",");
//               m++;
//           }
//       }
//       System.out.println(" }");
//
//       // Searching part is as following
//
//       System.out.println("Which element you want to search in the array :");
//       ch=choice.nextLine();
//       c=ch.toLowerCase(Locale.ROOT);
//       for (int k=0;k<=ele-1;k++){
//           alpha=search[k].toLowerCase(Locale.ROOT);
//           if(c.equals(alpha)){
//               System.out.println("Yes,it is present in the array ");
//               break;
//           }else if( k==ele-1 && !(c.equals(alpha))){
//               System.out.println("No entry Found in the Array ");
//           }
//
//       }
//
//          Prob no 3
//
//        float a,b,sum,avg;
//        int i,j,k,i1;
//        Scanner z =new Scanner (System.in);
//        Scanner marks=new Scanner(System.in);
//        i1=0;
//        sum=0f;
//
//        System.out.print("How many students are in the class : ");
//        i=z.nextInt();
//        float []array=new float[i];
//        System.out.println("Enter the marks of : ");
//
//        for (j=1;j<=i;j++){
//            System.out.format("Student no %d :",j);
//            b=marks.nextFloat();
//            array[j-1]=b;
//
//        }
//        System.out.print("Array is as : { ");
//
//        for (k=0;k<=j-2;k++){
//
//            System.out.print(array[k]);
//            sum=sum+array[k];
//            if (i1<=j-3) {
//                System.out.print(",");
//                i1++;
//            }
//        }
//        System.out.print(" }");
//        System.out.println(" ");
//        System.out.format("Sum of these marks is : %f",sum);
//        System.out.println(" ");
//        avg =sum/i;
//        System.out.format(" Average is as : %f",avg);
//
//        Problem no 4
//
//        Scanner Entries_1 = new Scanner(System.in);
//        Scanner Entries_2 = new Scanner(System.in);
//
//        int i_1,j_1,i_2,j_2,row_1,col_1,row_2,col_2,Max_row,Max_col,Max_i,Max_j;
//
//        System.out.println( "               First matrix is as        ");
//
//        System.out.print("Enter the number of rows    : ");
//        row_1 = Entries_1.nextInt();
//        System.out.print("Enter the number of columns : ");
//        col_1 = Entries_1.nextInt();
//
//
//        Max_row=0;
//        Max_col=0;
//
//        float[][] matrix_1 = new float[row_1][col_1];
//
//
//        System.out.println("                Enter the elements of the matrix    ") ;
//        for(i_1=0;i_1<row_1;i_1++)
//        {
//            for(j_1=0;j_1<col_1;j_1++)
//            {
//                System.out.format("Enter the entry at row no %d and column no 1 : ",i_1+1,j_1+1);
//                matrix_1[i_1][j_1] = Entries_1.nextInt();
//            }
//        }
//
//
//        System.out.println("                Second matrix is as  ");
//        System.out.println("         Entries of matrix are as     ");
//        System.out.print("Enter the no of rows     : ");
//        row_2=Entries_2.nextInt();
//        System.out.print("Enter the no of coloumns : ");
//        col_2=Entries_2.nextInt();
//
//
//        float [][] matrix_2=new float[row_2][col_2];
//        System.out.println("                Enter the elements of the matrix    ") ;
//        for(i_2=0;i_2<row_2;i_2++)
//        {
//            for(j_2=0;j_2<col_2;j_2++)
//            {
//                System.out.format("Enter the entry at row no %d and column no 1 : ",i_2+1,j_2+1);
//                matrix_2[i_2][j_2] = Entries_2.nextInt();
//            }
//        }
//
//        System.out.println("The elements of the matrix one are as follows :") ;
//        for(i_1=0;i_1<row_1;i_1++)
//        {
//            for(j_1=0;j_1<col_1;j_1++)
//            {
//                System.out.print(matrix_1[i_1][j_1]+"\t\t");
//            }
//            System.out.println(" ");
//        }
//        System.out.println("The elements of the matrix are as follows :") ;
//        for(i_2=0;i_2<row_2;i_2++)
//        {
//            for(j_2=0;j_2<col_2;j_2++)
//            {
//                System.out.print(matrix_2[i_2][j_2]+"\t\t");
//            }
//            System.out.println(" ");
//        }
//        if(row_1==row_2 && col_1==col_2){
//            Max_row=row_1;
//            Max_col=col_1;
//            System.out.println("Matrices can be added because they have equal rows and columns ");
//        }
//        else if (row_1==row_2 && col_1!=col_2){
//            System.out.print(" Matrices cannot be added ");
//        }else if (row_1!=row_2 && col_1==col_2){
//            System.out.print(" Matrices cannot be added ");
//        }else if (row_1!=row_2 && col_1!=col_2){
//            System.out.println("Matrices cannot be added");
//        }




//                                    // LOOP For Adding
//
//        System.out.println("Resultant matrix after addition is ");
//        for (Max_i=0;Max_i<Max_row;Max_i++)
//        {
//            for(Max_j=0;Max_j<Max_col;Max_j++)
//            {
//
//                System.out.print(matrix_1[Max_i][Max_j]+matrix_2[Max_i][Max_j] +"\t\t");
//            }
//            System.out.println(" ");
//
//         Prob no 5
//        int[] marks = {1, 2, 3, 4, 5};
//        for (int i = marks.length-1; i >= 0; i--) {
//            System.out.print(marks[i]);
//            if (i > 0) {
//                System.out.print(",");
//            }
//        }


//        Scanner entry = new Scanner(System.in);
//        Scanner Yes=new Scanner(System.in);
//        Scanner No=new Scanner(System.in);
//
//        int z,r1;
//        r1=0;
//        String input,inputs,input_2,inputs_2;
//
//
//        System.out.print(" How many entries you want to enter in array ? : ");
//        z = entry.nextInt();
//        System.out.println(" ");
//        System.out.println(" Enter your elements of array :");
//
//        int[] array = new int[z];
//
//        for (int i = 0; i < z; i++) {
//            array[i] = entry.nextInt();
//        }
//
//        System.out.print("Array is : { ");
//
//        for (int j = 0; j < z; j++) {
//            System.out.print(array[j]);
//            if (j < z - 1) {
//                System.out.print(",");
//            }
//        }
//
//        System.out.print(" }");
//        System.out.println(" ");
//
//        System.out.print("Do you want to sort the array ? TYPE(Yes/No) : " );
//        input=Yes.nextLine();
//        inputs=input.toLowerCase(Locale.ROOT);
//
//        if (inputs.equals("yes") || inputs.equals("y")) {
//            System.out.print("Sorted Array is : { ");
//            Arrays.sort(array);
//            for (int k = 0; k < z; k++) {
//                System.out.print(array[k]);
//                if (k < z - 1) {
//                    System.out.print(",");
//                }
//            }
//            System.out.print(" }");
//            System.out.println(" ");
//            System.out.format("Minimum element is :%d ", array[0]);
//            System.out.println(" ");
//            System.out.format("Maximum element is :%cd ", array[z - 1]);
//
//        }
//        else if (inputs.equals("no") || inputs.equals("n")){
//            System.out.print("Ok enjoy yourself. We have one more question for ya :)");
//        }
//
//        for(int reverse=0;reverse<z/2;reverse++){
//            int tem = array[z - reverse -1];
//            array[z - reverse -1] = array[reverse];
//            array[reverse] = tem;
//            r1++;
//
//        }
//        System.out.println(" ");
//        System.out.print("Do you want to reverse the array ? TYPE(Yes/No)");
//        input_2=No.nextLine();
//        inputs_2=input_2.toLowerCase(Locale.ROOT);
//
//        if(inputs_2.equals("yes") || inputs_2.equals("y")) {
//            System.out.println(" ");
//            System.out.print("Reverse array is : { ");
//            for (int l = 0; l < z; l++) {
//                System.out.print(array[l]);
//                if (l < z - 1) {
//                    System.out.print(",");
//                }
//            }
//            System.out.print(" }");
//        }
//        else if (inputs.equals("no") || inputs.equals("n")){
//            System.out.print("Ok! Enjoy yourself .Its only your choice what you w


    }
}
