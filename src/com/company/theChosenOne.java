package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class theChosenOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
       int n= sc.nextInt();
       while(n-->0){
           list.add(sc.nextInt());
       }

    }

    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
}
