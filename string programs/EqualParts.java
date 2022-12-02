import java.util.Scanner;

class EqualCheck {
    String str = "";
    int n;

    public String Result() {
        String result = "";
        int leng = str.length();
        if (leng % n == 0) {
            for (int i = 0; i <= leng - 1; i++) {
                if ((i + 1) % n != 0) {
                    result = result + str.charAt(i);
                } else {
                    result = result + str.charAt(i) + "\n";
                }
            }
        } else {
            return "String cannot be divided into " + n + " equal parts";
        }
        return result;
    }

    EqualCheck(String str, int n) {
        this.str = str;
        this.n = n;
    }
}

public class EqualParts {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence:");
        String str = sc.nextLine();
        int n = sc.nextInt();
        EqualCheck eq = new EqualCheck(str, n);
        String Output = eq.Result();
        System.out.println(Output);
        sc.close();
                
    }
}


// string running