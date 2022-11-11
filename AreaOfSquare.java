/**
 * Program to print area of square
 * inputs:
 *  user will enter the length of side
 * output:
 *  user will get the area of sqaure based on formula side*side
 */

import java.util.Scanner;
public class AreaOfSquare {                                     
    public static void main(String[] args) {                    
    System.out.println("Enter the side:");                     
        Scanner input = new Scanner(System.in);                 
        Double side= input.nextDouble();
        Double area = side*side;
        System.out.println("Area of square is" +" "+ area);     
        input.close();
    }
}                                                               

/**
 * example:
 *  Enter the side:
 *      10
 *  Area of sqaure is: 100.0
 */
