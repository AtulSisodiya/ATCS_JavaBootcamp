//class Student{
//	int rollno;
//	String name;
//	static String collegename ="JECRC";
//	public Student(int rollno,String name) {
//		super();
//		this.rollno=rollno;
//		this.name=name;
//		
//	}
//	void display() {
//		System.out.println(rollno+" "+name+" "+collegename);
//		
//	}
//}
class Dem{
	public int add() {
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
		return c;
		
		
	}
	static int sub() {
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println(c);
		return c;
	}
	
	
}
public class Demo {
	public static void main(String args[]) {
		Dem obj = new Dem();
		obj.add();
		Dem.sub();
//		Student s1= new Student(101,"Atul");
//		Student s2= new Student(102,"Sidhart");
//		s1.display();
//		s2.display();
		
		
		
		
	}

}
