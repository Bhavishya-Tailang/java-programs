/**
 * program to use while loop and adding values in variables
 */

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        sc.close();
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Result will be:"+" "+b);
    }
}

/**
 * example:
 * Enter the number:
 *  11
 * Result will be: 89
 */
