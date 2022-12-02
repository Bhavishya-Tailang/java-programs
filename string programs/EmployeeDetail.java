import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private String address;

    public String fullDetail() {
        return "Your name is " + this.firstName + " " + this.lastName + " " + "Your address is " + this.address;
    }

    void setData(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // public String changeFirstName(String replaceFirst) {
    // return this.firstName = replaceFirst;
    // }

    // public String changeLastName(String replaceLast) {
    // return this.lastName = replaceLast;
    // }

    // public String changeAddress(String replaceAddress) {
    // return this.address = replaceAddress;
    // }

}

class EmployeeDetail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            Employee emp = new Employee();
            System.out.println("Enter your first name: ");
            String firstName = sc.nextLine();
            System.out.println("Enter your last name: ");
            String lastName = sc.nextLine();
            System.out.println("Enter your address: ");
            String address = sc.nextLine();
            emp.setData(firstName, lastName, address);
            String finalDetail = emp.fullDetail();
            System.out.println(finalDetail);
            sc.close();
        }
    }
}

// String modifiedFname = "Harsh"; // from user input
// emp.changeFirstName(modifiedFname);
// String modifiedLname = "Sethi";
// emp.changeLastName(modifiedLname);
// String modifiedAddress = "Pune";
// emp.changeAddress(modifiedAddress);

// running