package com.company;

import javax.swing.*;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Int_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (-100 <= N && N <= 100) {
            N = N;
        }
        String x = Integer.toString(N);

    }
}
