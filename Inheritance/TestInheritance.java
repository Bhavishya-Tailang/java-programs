// single level Inheritance
class Parent
{
	void work()
	{
		System.out.println("working");
	}
}
class Child extends Parent
{
	void sleep()
	{
		System.out.println("sleeping");
	}
}
class TestInheritance{
public static void main(String args[])
{
	Child c = new Child();
	c.sleep();
	c.work();
}
}

// running
