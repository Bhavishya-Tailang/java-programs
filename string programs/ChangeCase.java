
class CheckCase {                                               
    String str = "aBcdEfG";

    String Result() {
        String res = "", lowerChar = "", upperChar = "";
        int charAscii;
        int leng = str.length() - 1;
        for (int i = 0; i <= leng; i++) {
            charAscii = str.charAt(i);
            if (charAscii >= 97 && charAscii <= 122) {
                lowerChar = lowerChar + str.charAt(i);
            } else if (charAscii >= 65 && charAscii <= 90) {
                upperChar = upperChar + str.charAt(i);
            }
        }
        return res = res + this.Reverse(upperChar) + this.Reverse(lowerChar);
    }

    public String Reverse(String inputString) {                              // creating a function 
        String result = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            result = result + inputString.charAt(i);
        }
        return result;
    }
}

public class ChangeCase {                                                   // main class or class block
    public static void main(String[] args) {
        CheckCase cs = new CheckCase();                                     // instance of class                                      
        System.out.println(cs.Result());                                    // printing result
    }
}



// string running