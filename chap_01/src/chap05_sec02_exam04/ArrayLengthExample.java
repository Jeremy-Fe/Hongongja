package chap05_sec02_exam04;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.printf("평균 : %.2f", avg);
		
		System.out.println("\n-------------------------");
		
		String[] str = new String[3];
		str[0] = "A";
//		str[1] = "B";
		str[2] = "C";
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
}
