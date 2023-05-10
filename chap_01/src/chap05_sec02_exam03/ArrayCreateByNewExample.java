package chap05_sec02_exam03;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (i + 1) * 10;
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
//		arr2[0] = 0.1;
//		arr2[1] = 0.2;
//		arr2[2] = 0.3;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (double)(i + 1) / 10;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
//		arr3[0] = "1월";
//		arr3[1] = "2월";
//		arr3[2] = "3월";
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (i + 1) + "월";
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}
