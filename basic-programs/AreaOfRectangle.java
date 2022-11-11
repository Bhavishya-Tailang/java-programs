/**
 * Program to print area of rectangle.
 * inputs: 
 *  user will enter length and breadth.
 * output:
 *  user will get the area of rectangle based on formula length*breadth
*/ 

import java.util.Scanner;

public class AreaOfRectangle {                                  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        Double l = sc.nextDouble();                            
        System.out.println("Enter the breadth:");
        Double b = sc.nextDouble();  
        sc.close();                          
        Double area = l*b;
        System.out.println("Area of rectangle is:"+" "+area);  
    }
} 

/**
 * example:
 *  Enter the length:
 *      10
 *  Enter the breadth:
 *      20
 *  Area of rectangle is: 200.0
 */
