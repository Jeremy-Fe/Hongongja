package chap06_sec06_exam05.package1;

public class B {
	// 같은 패키지 내의 클래스
	public B() {
		A a = new A();
		a.field1 = 1; // public 가능 
		a.field2 = 2; // default 가능
//		a.field3 = 3; privat 필드 접근 불가 (컴파일 에러)
		
		a.method1();
		a.method2();
//		a.method3(); private 메소드 접근 불가 (컴파일 에러)
		
	}
}
