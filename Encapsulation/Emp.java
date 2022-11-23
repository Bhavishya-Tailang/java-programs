//Encapsulation: Wrraping up data members and member function into a single unit

class Emp{
	static String cname = "tcs";
	String name;
	int salary;
	void get (String s1, int s2, String s3){
		name = s1;
		salary=s2;
		cname=s3;
	}
	void show(){
		System.out.println(cname);
		System.out.println(salary);
		System.out.println(name);
	}
	static int add(int a, int b){
		return a+b;
	}
	public static void main(String args[]){
		Emp e1 = new Emp();
		System.out.println(e1.hashCode());
		System.out.println(e1);
		e1.name="ram";	
		System.out.println(e1.name);
		Emp e2=e1;
		Emp e3=e1;
		System.out.println(e2.hashCode());
		System.out.println(e2);
		e2.name="ben";
		System.out.println(e2.name);
		System.out.println(e3.cname);
	}
}
/// e1.name

/* ouput: 
1995265320
Emp@76ed5528
ram
1995265320
Emp@76ed5528
ben
tcs */