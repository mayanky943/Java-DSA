package com.company;

import java.util.Arrays;
import java.util.Scanner;

class validMountainArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //length of the array
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        boolean ans=isValid(arr);
        System.out.println(ans);

    }

    private static boolean isValid(int[] arr) {
        if(arr.length < 3) return false;
        int l = 0;
        int r = arr.length - 1;
        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) l++;
        while(r - 1 > 0 && arr[r] < arr[r - 1]) r--;
        return l == r;
    }


}