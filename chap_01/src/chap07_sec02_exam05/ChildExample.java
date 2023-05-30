package chap07_sec02_exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 타입 변환 (child 에서 선언 된 필드와 메소드 사용 불가)
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3(); 불가능
		
		Child child = (Child) parent; // 강제 타입 변환 (자식 타입이 부모타입으로 변환(객체생성)되어있는 상태만 가능)
		child.field2 = "yyy";
		child.method3();
		
	}
}
