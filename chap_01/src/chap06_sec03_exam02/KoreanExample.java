package chap06_sec03_exam02;

class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("신우철", "001130-3000000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("박지영", "010627-4000000");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
