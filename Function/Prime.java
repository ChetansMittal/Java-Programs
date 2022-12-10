package Function;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        if(isPrime(num)){
            System.out.println(num + " is a prime number");
        }else
            System.out.println(num + " is not a prime number");
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        for (int i =2;i<=n;i++){
            if(n%2==0) return false;
        }
        return true;


    }

}
