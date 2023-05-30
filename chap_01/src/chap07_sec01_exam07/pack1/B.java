package chap07_sec01_exam07.pack1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	} // 같은 패키지는 얼마든지 접근 가능
}
