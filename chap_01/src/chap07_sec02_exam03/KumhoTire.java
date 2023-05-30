package chap07_sec02_exam03;

public class KumhoTire extends Tire{
	// 필드
	
	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드 (다른 내용을 출력하기 위해 재정의한 roll() 메소드 (메소드 오버라이딩))
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) { // 정상회전 (누적 < 최대 ) 일 경우 실행
			System.out.println(location + "KumhoTire  수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { 
			System.out.println("*** " + location + " KumhoTire 펑크 ***"); // 펑크(누적 = 최대) 일 경우 실행
			return false;
		}
	}
}
