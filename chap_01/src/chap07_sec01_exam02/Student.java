package chap07_sec01_exam02;

public class Student extends People{
	public int studentNo;
	
	public Student() {
		System.out.println("Student()");
	}
	
	
	public Student(String name, String ssn, int studentNo) {
		super(name,  ssn);
		this.studentNo = studentNo;
	}
	
	
}
