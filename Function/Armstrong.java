package Function;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = in.nextInt();

        if(isArmstrong(num)){
            System.out.println(num + " is an armstrong number");
        }else System.out.println(num + " is not an armstrong number");
    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while(n>0){
            int rev=n%10;
            sum= sum+ rev*rev*rev;
            n=n/10;
        }
        if (original==sum) return true;

        return false;
    }
}
