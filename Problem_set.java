package com.company;

import java.awt.geom.Area;
import java.util.Scanner;

class cylinder {
    private int   radius;
    private int height;
    int area;
    int volume;

    public cylinder() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of Radius : ");
        int radius=sc.nextInt();
        this.radius = radius;

        System.out.print("Enter the value of Height : ");
        int height= sc.nextInt();
        this.height = height;

        int area=(int)(2*(Math.PI)*radius*height);
        this.area = area;
        System.out.println(area);
        int volume=(int)(Math.pow((Math.PI),2)*radius*height);
        this.volume = volume;
        System.out.println(volume);
    }




    // Part with getter and setter

//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//
//
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public double Area(int radius,int height){
//        double a=2*(Math.PI)*radius*height;
//        return a;
//        }
//    public double Volume(int radius,int height) {
//        double v=Math.pow((Math.PI),2)*radius*height;
//        return v;
//    }
}

class rectangle {
    private int length;
    private int breadth;

    public rectangle(int length, int breadth) {

        this.length = length;

        this.breadth = breadth;

        int area=length*breadth;
        System.out.println(area);
        int Perimeter=length+breadth;
        System.out.println(Perimeter);
    }
    public rectangle() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length=sc.nextInt();
        this.length = length;

        System.out.print("Enter the breadth : ");
        int breadth= sc.nextInt();
        this.breadth = breadth;

        int area=length*breadth;
        System.out.println(area);
        int Perimeter=length+breadth;
        System.out.println(Perimeter);
    }
}



public class Problem_set {

    public static void main(String[] args) {


//        cylinder j = new cylinder();

        rectangle k=new rectangle();




        // Part with getters and setters
//        j.setHeight(12);
//        j.setRadius(3);
//        System.out.println(j.getHeight());
//        System.out.println(j.getRadius());
//        double a_1=j.Area(j.getHeight(),j.getRadius());
//        double v_1=j.Volume(j.getHeight(),j.getRadius());
//        System.out.println((int)(a_1));
//        System.out.println((int)(v_1));


    }
}
