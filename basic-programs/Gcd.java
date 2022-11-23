/*
 * program to find gcd of two numbers
 * input:
 *  user will enter two values
 * outpuut:
 *  output will be gcd of two values
 */


import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        System.out.println("GCD of x and y is: " + y);
        sc.close();
    }
}