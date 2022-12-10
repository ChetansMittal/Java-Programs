package Function;

import java.util.Scanner;

public class Frequency_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        double n = in.nextDouble();
        System.out.println("Enter the nube to searvh");
        int find = in.nextInt();
        int count=0;

        while (n > 0 ){
            int m = (int) (n%10);
            if(m==find){
                count+=1;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
