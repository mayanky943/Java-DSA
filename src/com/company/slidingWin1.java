package com.company;

import java.util.Scanner;

//In this problem of sliding window we'll be looking at the problem of max size subarray.
//Size of the window will be given to us
public class slidingWin1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); //array size
        int win_size= sc.nextInt(); //window size
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int cur_sum=0;
        int j=0,i=0;
        int max_sum=Integer.MIN_VALUE;
        while (j< arr.length){
            if(j-i+1<win_size+1){
                cur_sum+=arr[j];
                j++;
            }
            else if(j-i+1==win_size+1){
                max_sum=Integer.max(cur_sum,max_sum);
                cur_sum+=arr[j]-arr[i];
                j++;
                i++;
            }
        }
        System.out.println(max_sum);


        }

    }

