/*public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Test{
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Harry Potter");
        System.out.println(s.getName());
    }
}


// class nameCollection has 3 proerties
/// name
/// getname
/// setname(name)
{
    this.name = name
}


// input - value - bhavishya
|_____ashok____|
|_____Kumar________| 

// your name is ashok kumaer
*/
class NameCollection {
    private String fName; // rahul
    private String lName; // kumar
    private String address; // kumar
    // private String address;

    public String getName() {
        return "your name is " + this.fName + ' ' + this.lName + " " + this.address;

    }

    public void setName(String fName, String lName) { // name is the parameter here
        // we are assigning the class's internal properties name with the parameters
        // that we assigned above.
        this.fName = fName;
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
        
    }
    }

class student {
    public static void main(String[] args) {
        NameCollection nm = new NameCollection();
        String fName = "rahul";
        String lName = "kumar";
        String address = "New Delhi";
        nm.setName(fName, lName); // we are passing Rahul as the argument so that function can use it as a
        nm.setAddress(address);                                 // paramter and set the value in the private variable
        String fullName = nm.getName(); // your name is Rahul Kumar
        System.out.println(fullName);
    }

}

//running

/**
 * variables
 * int a = 10;
 * 
 * 
 * 
 * functions
 *
 * int add(int par1, int par2, int par3) { // <- who will provide this function
 * the parameters while definning function
 * private int result = 0;
 * result = par1 + par2 + par3;
 * return result;
 * }
 * 
 * fnName(1,2,3); // <- while calling this function we will privde the arguments
 * 
 * 
 * 
 */
