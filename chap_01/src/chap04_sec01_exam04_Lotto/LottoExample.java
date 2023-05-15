package chap04_sec01_exam04_Lotto;

public class LottoExample {
	public static void main(String[] args) {
		int[] lotto = new int[7];
		
		for (int i = 0; i < lotto.length; i++) { // 배열에 무작위 숫자를 넣는 코드
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) { // 중복된 숫자를 생기면 그 숫자를 다시 배정 받는 코드
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}

		
		for (int i = 0; i < lotto.length-1; i++) { // 보너스 번호를 제외한 6 숫자를 오름차순으로 정렬하는 코드
			for (int j = 0; j < i; j++) { // Swop 굉장히 많이 사용하는 알고리즘
				if(lotto[i] < lotto[j]) { 
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.println("2023회 당첨결과");
		for (int i = 0; i < lotto.length-1; i++) {
			System.out.print(lotto[i] + " ");
		}
		int bonus = lotto[lotto.length-1];
		System.out.print("+ 보너스 " + bonus);
	}
}
