/**
 * progrm to use other class function in main class block
 */

class Information {
    private String someText = "hello world!";

    public String showText() {
        return this.someText;
    }

    public String setText(String inputText) {
       return this.someText = inputText;
    }
}

class ShowMessage{
    public static void main(String args[]) {
    Information informationInstance = new Information();    
    String modifiedMessage = "this is modified Hello world";
    informationInstance.setText(modifiedMessage);
    String message = informationInstance.showText();
    System.out.println(message);
    }
}

/**
 * output:
 *  this is modified Hello world
 */