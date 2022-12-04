// even string reverse

import java.util.Scanner;

class EvenCheck {
    private String name = "abcdefgh";
    String evenChars = "", oddChars = "", reversedEvenChars = "";

    public String Result() {
        int length = name.length();
        for (int i = 0; i <= length - 1; i++) {
            if (i % 2 == 0) {
                oddChars = oddChars + name.charAt(i);
            } else {
                evenChars = evenChars + name.charAt(i);
            }
        }

        return ReverseAndCombine(oddChars, evenChars); // this.ReverseAndCombine

    }

    public String ReverseAndCombine(String str1, String str2) {
        String result = "";
        int str1Leng = str1.length() - 1;
        int str2Leng = str2.length() - 1;
        for (int i = 0; i <= str1Leng; i++) {
            if (str2Leng - i < 0) {
                result = result + str1.charAt(i);
            } else {
                result = result + str1.charAt(i) + str2.charAt(str2Leng - i);
            }
        }
        return result;
    }

    // public String Reverse(String input) {
    // String result = "";
    // int leng = input.length();
    // for (int i = leng - 1; i >= 0; i--) {
    // result = result + input.charAt(i);
    // }
    // return result;
    // }

    // public String Combine(String str1, String str2) {
    // String result = "";
    // int leng = str1.length();
    // for (int i = 0; i <= leng - 1; i++) {
    // result = result + str1.charAt(i) + str2.charAt(i);
    // }
    // return result;
    // }
}

public class ReverseEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            EvenCheck ec = new EvenCheck();

            String Output = ec.Result();
            System.out.println(Output);
            sc.close();
        }

    }
}

// reversedEvenChars = this.Reverse(evenChars);
// return this.Combine(oddChars, reversedEvenChars); // oddChars + " " +
// reversedEvenChars;// oddChars + "" +


// string running