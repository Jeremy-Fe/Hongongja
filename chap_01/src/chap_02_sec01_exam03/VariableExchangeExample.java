package chap_02_sec01_exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		// Swap 변수를 서로 바꾸는 
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y : " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y : " + y);
	}

}
