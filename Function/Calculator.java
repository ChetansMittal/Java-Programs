package Function;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true){
            System.out.println("Enter the Operator : ");
           char op = in.next().trim().charAt(0);
            int ans=0;
           if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
               //take input from user

               System.out.println("Enter the Operands : ");
               int num1= in.nextInt();
               int num2 = in.nextInt();

               if (op == '+') ans = num1+num2;
               if (op == '-') ans = num1-num2;
               if (op == '*') ans = num1*num2;
               if (op == '/') ans = num1/num2;
               if (op == '%') ans = num1%num2;

           } else if (op == 'x' || op == 'X') {
               break;
           } else{
               System.out.println("Invalid Operator");
           }

            System.out.println(ans);
        }

    }
}
