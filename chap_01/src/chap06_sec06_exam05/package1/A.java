package chap06_sec06_exam05.package1;

public class A {
	// 필드
	public int field1;
	int field2; // default 접근 제한
	private int field3;
	
	// 생성자
	public A() {
		field1 = 1;
		field2 = 2;
		field3 = 3;
		//             같은 클래스 내부일 경우 접근 제한자의 영향을 받지 않음
		method1();
		method2();
		method3();
	}
	
	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
