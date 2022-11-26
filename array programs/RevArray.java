class Reverse {
    int num[] = new int[] { 1, 2, 3, 4, 5 };

    void Result() {
        int leng = num.length;
        for (int i = 0; i < leng; i++) {
            System.out.print(num[i]);
        }
        System.out.println();
        for (int i = leng - 1; i >= 0; i--) {
            System.out.print(num[i]);
        }
    }
}

public class RevArray {
    public static void main(String[] args) {
        Reverse rs = new Reverse();
        rs.Result();
    }
}


//array running