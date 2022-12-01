import java.util.Scanner;

class RevCheck {
    private String name;
    String rev = "";

    public String Result() {
        int leng = name.length();
        for (int i = leng - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        return "Reverse is " + rev;
    }

    void setInput(String name) {
        this.name = name;
    }

}

public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            RevCheck rc = new RevCheck();
            System.out.println("Enter the String ");
            String name = sc.nextLine();
            rc.setInput(name);
            String Output = rc.Result();
            System.out.println(Output);
            sc.close();
        }

    }
}

// string running