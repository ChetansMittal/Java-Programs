package Function;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        int a=0;
        int b=1;
        System.out.println("enter the size");
        int n = in.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i =2;i<n;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(b);
        }

    }
}
