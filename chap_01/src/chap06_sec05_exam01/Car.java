package chap06_sec05_exam01;

public class Car {
	// 필드 (멤버 변수)
	String model;
	int speed;
	
	// 생성자
	Car(String model){
		this.model = model;
		setSpeed(0); // 자바에서는 있어도 없어도 됨(초기화)
	}
	


	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속:"
					+ this.speed + "km/h)");
		}
	}
	
	
	
}
