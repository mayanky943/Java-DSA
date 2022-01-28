package com.company;

import java.util.Locale;
import java.util.Scanner;

public class detectCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String word1="";
        boolean ans=false;

        for(int i=0;i<word.length();i++){
            if(i==0){
                word1+=word.substring(0,1).toUpperCase();
            }
            else word1+=word.toLowerCase().charAt(i);
        }

        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || word.equals(word1)){
            ans=true;
        }
        System.out.println(ans);


    }
}
