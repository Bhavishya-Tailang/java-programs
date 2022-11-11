
/**
 * Program to create a calculator
 * inputs: 
 *  an operator like add, subtract, divide, multiply or modulus
 *  two numbers on which operation is to be performed
 * output:
 *  result of the operation applied on 2 numbers
 * To exit: press 'x' or 'X'
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user till user press x or X
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.print("Invalid");
            }
            System.out.println("result is: " + ans);
        }
        sc.close();
    }
}

/**
 * example: 
 * Input:
 *  Enter the operator: *
 *  Enter the first number: 3
 *  Enter the second number: 4
 * Output:
 *  Result is: 12
 */