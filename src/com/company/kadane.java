package com.company;

public class kadane {
    public static void main(String[] args) {
        int [] arr={-5,4,6,-3,4,-1};
        int max=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];

            if(curr_sum>max){
                max=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        System.out.println(max);
    }
}
