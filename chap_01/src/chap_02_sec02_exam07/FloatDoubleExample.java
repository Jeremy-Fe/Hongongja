package chap_02_sec02_exam07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값 저장
		// float var1 = 3.14; <- 컴파일 에러
		float var1 = 3.14f;
		double var2 = 3.14;
		
		// 정밀도 테스트
		float var3 = 0.1234567890123456789f;
		double var4 = 0.1234567890123456789;
		
		System.out.println("var 1 : " + var1);
		System.out.println("var 2 : " + var2);
		System.out.println("var 3 : " + var3);
		System.out.println("var 4 : " + var4);
		
		
		// e 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		System.out.println("var 6 : " + var6);
		System.out.println("var 7 : " + var7);
		System.out.println("var 8 : " + var8);
		
	}
}
