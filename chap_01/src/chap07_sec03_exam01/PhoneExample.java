package chap07_sec03_exam01;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone(); 추상클래스는 객체 생성 불가
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
}
