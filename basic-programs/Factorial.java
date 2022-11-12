/**
 * program to print factorial of the number
 * input:
 *  user will enter the number
 * output:
 *  user will get the factorial of the number
 */

import java.util.Scanner;

class Logic {
    int result = 1;
    public int series(int inputNumber) {
        for (int i = 1; i <= inputNumber; i++) {
            result = result * i;
        }
        return result;
    }
}

class Factorial {
    public static void main(String args[]) {
        int num, fact;
        Logic lg = new Logic();
        // num = 0;z
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        sc.close();
        fact = lg.series(num);
        System.out.println("Factorial of the number is: " + " " + fact);
    }
}

/**
 * example:
 *  Enter the Number:
 *      5
 * Factorial of the number is:  120
 */
