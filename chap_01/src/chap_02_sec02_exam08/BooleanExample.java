package chap_02_sec02_exam08;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		if(!stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}

}
