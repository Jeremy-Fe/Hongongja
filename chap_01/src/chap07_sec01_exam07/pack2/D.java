package chap07_sec01_exam07.pack2;

import chap07_sec01_exam07.pack1.A;

public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method(); // 다른 패키지 !자식! 클래스는 가능!!
	}
}
