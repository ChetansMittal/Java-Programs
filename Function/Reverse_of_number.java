package Function;

import java.util.Scanner;

public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ener the number");
        int num = in.nextInt();
        int rev = 0;
        while(num>0){
            int m = num %10;
            rev = rev*10 + m;
            num = num/10;
        }
        System.out.println("Reverse of a number is : " +rev );
    }
}
