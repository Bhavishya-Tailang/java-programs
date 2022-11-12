/**
 * program to print odd numbers in descending order
 * input:
 *  values are numbers from 1 to 100
 * output:
 *  result will be odd numbers in descending order.
 */

class Oddnum {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
