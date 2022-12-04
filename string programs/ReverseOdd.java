import java.util.Scanner;

class OddCheck {
    private String name;
    String evenChars = "", oddChars = "";

    public String Result() {
        int length = name.length();
        for (int i = 0; i <= length - 1; i++) {
            if (i % 2 == 0) {
                evenChars = evenChars + name.charAt(i);
            } else {
                oddChars = oddChars + name.charAt(i);
            }
        }
        return EvenRevOdd(evenChars, oddChars); // ReverseCombine(evenChars, oddChars);
    }

    // public String ReverseCombine(String str1, String str2) {
    //     String result = "";
    //     int str1Leng = str1.length() - 1;
    //     int str2Leng = str2.length() - 1;
    //     System.out.print(str2);
    //     for (int i = 0; i <= str1Leng; i++) {
    //         if (str2Leng < 0) {
    //             result = result + str2;
    //         } else {
    //             result = result + str1.charAt(str1Leng - i);
    //         }
    //     }
    //     return result;
    // }

    public String EvenRevOdd(String str1, String str2) {
        String result = "";
        int str1Leng = str1.length() - 1;
        int str2Leng = str2.length() - 1;
        for (int i = 0; i <= str1Leng; i++) {
            if (str2Leng - i < 0) {
                result = result + str2.charAt(i);
            } else {
                result = result + str2.charAt(i) + str1.charAt(str1Leng - i);
            }
        }
        return result;
    }

    void setData(String name) {
        this.name = name;
    }

}

public class ReverseOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            OddCheck oc = new OddCheck();
            System.out.println("Enter the Sentence: ");
            String name = sc.nextLine();
            oc.setData(name);
            String Output = oc.Result();
            System.out.println(Output);
            sc.close();
        }
    }
}


// string running