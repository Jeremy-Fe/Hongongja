package chap07_sec01_exam01;

public class NoteCellPhone extends CellPhone{
	// 필드
	
	
	// 생성자
	NoteCellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}





	// 메소드
	void takePen() {
		System.out.println("펜을 꺼냅니다");
	}
	void Pendraw() {
		System.out.println("펜으로 그립니다.");
	}
	void putPen() {
		System.out.println("펜을 넣습니다.");
	}
	
	
	
	
}
