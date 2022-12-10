package Function;

import  java.io.*;
import java.lang.*;
import java.util.*;


public class Largest_of_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int max =a;
        if(b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println(max + " is largest");
    }
}