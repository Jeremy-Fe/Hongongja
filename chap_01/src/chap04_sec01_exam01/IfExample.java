package chap04_sec01_exam01;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) // if 문 중괄호가 없기 때문에 바로 아래 한줄만 if 문에 해당
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다"); // if 문에 해당하지 않는 코드 
	}
		// 괄호 {} 블록은 생략하지 않고 작성하는 것을 추천. 하지 않으면 가독성, 해석이 어렵고 
		// 버그 발생의 원인이 될 수 있음.
}
