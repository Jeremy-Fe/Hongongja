package chap04_sec01_exam04_Lotto;

public class LottoExamplePrac {
	public static void main(String[] args) {
		int n[] = new int[6];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if(n[i] == n[j]) {
					i--;
				}
				if(n[i] < n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

}
