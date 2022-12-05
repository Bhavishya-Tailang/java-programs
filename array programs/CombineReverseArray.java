class EvenOddArray {
    int num[] = new int[] { 1, 2, 3, 4, 5 };

    public void EvenOdd() {
        int leng = num.length;
        int CountOddNum = 0;
        int CountEvenNum = 0;

        for (int i = 0; i <= leng - 1; i++) {
            if (num[i] % 2 == 0) {
                CountEvenNum = CountEvenNum + 1;
            } else {
                CountOddNum = CountOddNum + 1;
            }
        }
        int oddNum[] = new int[CountOddNum];
        int evenNum[] = new int[CountEvenNum];
        int k = 0, j = 0;
        for (int i = 0; i < leng - 1; i++) {
            if (num[i] % 2 == 0) {
                evenNum[j] = num[i];
                j++;
            } else {
                oddNum[k] = num[i];
                k++;
            }
        }
        for (j = 0; j < leng - 1; j++) {
            System.out.print(evenNum[j]);
        }
        System.out.println();

        for (k = 0; k < leng - 1; k++) {
            System.out.print(oddNum[k]);
        }
    }

}

public class CombineReverseArray {
    public static void main(String[] args) {
        EvenOddArray ea = new EvenOddArray();
        ea.EvenOdd();
    }
}