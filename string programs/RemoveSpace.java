class CheckSpace {
    String str = "Hello World";

    public String Spaces() {
        String res = "";
        for (int i = 0; i<= str.length()- 1; i++) {
            if (str.charAt(i) != ' ') {
                res = res + str.charAt(i); 
                
            }
        }
        return res;
    }

}

public class RemoveSpace {
    public static void main(String[] args) {
        CheckSpace cs = new CheckSpace();
        System.out.println(cs.Spaces());
    }
    
}


// string running