//Write a program to find LCM of given array elements

public class Lcm {
    public static void main(String[] args) {
        int arr[] = {15, 45, 65};
        int min, max , lcm = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    max = arr[i];
                } else {
                    min = arr[i];
                    max = arr[j];
                }
                for (int x = 0; x < arr.length; x++) {
                    int k = x * max;
                    if (k % min == 0) {
                        lcm = k;
                    }
                }
            }
        }
        System.out.println(lcm);
    }
}