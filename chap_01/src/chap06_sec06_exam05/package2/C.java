package chap06_sec06_exam05.package2;

import chap06_sec06_exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; // public 가능
//		a.field2 = 2; // default 필드 접근 불가(다른 패키지)
//		a.field3 = 3; // private 필드 접근 불가(다른 클래스)
		
		a.method1();
//		a.method2();
//		a.method3();
	}
}
