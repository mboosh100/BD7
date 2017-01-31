
public class Student 
{	
	// Private attributes that define class
	private String id;
	private String name;
	private int age;
	
	public static void main(String[] args) {
//	{
//		System.out.println("Hello");
//	}
	Student s1= new Student("1234","bob",23);
	s1.printDetails();	
	}
	public Student(String id,String name,int age)
    {
    id = "???";
    name = "???";
    age = 0;
    }
	
	public void printDetails()
    {
	System.out.println("id" +id+ "\n"+ "age" + age );
	System.out.println("name" +name);
	
    }
//    public Student(String i,String n, int a, String mods)
//    {
//    	id = i;
//    	name = n;
//    	age = a;
//    	modules = mods;
//    }
    
}