/**
 * program to find greatest number
 * input:
 *  user will enter three numbers.
 * output:
 *  largest number will be shown among three numbers
 */

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args){
    int a, b, c, t, largest;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the  first number:");
    a = sc.nextInt();
    System.out.println("Enter the  second number:");
    b = sc.nextInt();
    System.out.println("Enter the third number:");  
    c = sc.nextInt();
    sc.close();
    t = a>b?a:b;
    largest = c>t?c:t;
    System.out.println("Largest number:" +" "+ largest);
    }
}

/**
 * example:
 * Enter the  first number: 5
 * Enter the  second number: 10
 * Enter the  third number: 77
 * Largest number: 77
 */
