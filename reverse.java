package example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class reverse {

    static char[] swap( char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        //System.out.println(set);
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;

        while(i<j){
            char x=ch[i];
            char y=ch[j];
                if(set.contains(x)&& set.contains(y)) {
                    ch = swap(ch, i, j);
                    i++;
                    j--;
                }
                if(!set.contains(x) && set.contains(y)) {
                    i++;
                }
                if(set.contains(x) && !set.contains(y)) {
                    j--;
                }
                if(!set.contains(x) && !set.contains(y)){
                    i++;
                    j--;
                }
        }
        System.out.println(new String(ch));

    }
}
