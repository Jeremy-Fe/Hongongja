package chap07_sec01_exam02;

public class People {
	public String name;
	public String ssn;
	
	public People() {
		System.out.println("People()");
	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
