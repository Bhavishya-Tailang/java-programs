// name(first and last)

class NameDetails {
    private String firstName = "Bhavishya";
    private String lastName = "Tailang";

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public String changeFirstName(String replaceFirst) {
       return this.firstName = replaceFirst;
    }

    public String changeLastName(String replaceLast) {
      return this.lastName = replaceLast;
    }

}

class Fullname {
    public static void main(String args[]) {
        NameDetails nd = new NameDetails();
        String modifiedFirstName = "Aman";
        nd.changeFirstName(modifiedFirstName);
        String modifiedLastName = "Sharma";
        nd.changeLastName(modifiedLastName);
        String showName = nd.fullName();
        System.out.println(showName);
    }
}