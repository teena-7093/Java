package day_2;

public class Student {
String stdname;
int stdid;
	public static void main(String[] args) {
	   Student s1= new Student();
	   s1.stdname = "sri";
	   s1.stdid = 1234;
	   System.out.println("Student name : "+s1.stdname);
       System.out.println("Student Id : "+s1.stdid);
       System.out.println();
       Student s2= new Student();
       s2.stdname = "radha";
       s2.stdid = 5678;
	   System.out.println("Student name : "+s2.stdname);
       System.out.println("Student Id : "+s2.stdid);
       Student s3= new Student();
	   s3.stdname = "jaya";
	   s3.stdid = 1234;
	   System.out.println("Student name : "+s3.stdname);
       System.out.println("Student Id : "+s3.stdid);
       Student s4= new Student();
       s4.stdname = "krishna";
       s4.stdid=9087;
	   System.out.println("Student name : "+s4.stdname);
       System.out.println("Student Id : "+s4.stdid);
	}
}
