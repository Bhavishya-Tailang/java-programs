/**
 * program to check if day is weekday or weekend using switch
 * input:
 *  user will enter the number of day
 * ouput:
 *  result will be given as weekend or weekday
 */

import java.util.Scanner;

public class SwitchLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        sc.close();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Different planet");
        }
    }
}

/**
 * example:
 * Enter the day: 4
 *  Weekday
 * Enter the day: 7
 *  Weekend
 * Enter the day: 10
 *  Different planet
 */