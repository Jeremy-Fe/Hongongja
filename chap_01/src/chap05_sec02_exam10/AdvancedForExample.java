package chap05_sec02_exam10;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for(int score : scores) { // 향상된  for 문 : 순차적으로 배열을 순회할 때만 편함
			sum += score;
			System.out.print(score + " ");
		}
//		for (int i = 0; i < scores.length; i++) { // 일반 for 문으로 실행
//			sum += scores[i];
//			System.out.print(scores[i] + " ");
//		}
//		for (int i = 0; i < scores.length; i+=2) { // 홀수만 실행
//			sum += scores[i];
//			System.out.print(scores[i] + " ");
//		}
//		for (int i = 2; i < scores.length; i++) { // 3번부터 5번 실행
//			sum += scores[i];
//			System.out.print(scores[i] + " ");
//		}
		
		System.out.println("\n점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
		
	}
}
