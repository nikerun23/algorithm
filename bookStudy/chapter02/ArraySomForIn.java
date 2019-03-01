package algorithm.bookStudy.chapter02;

public class ArraySomForIn {

	public static void main(String[] args) {

		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0,};
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%s] = %s\n", i, a[i]);
		}
		int sum = 0;
		
		// 확장 for문
		for (double i : a) {
			sum += i;
		}
		System.out.printf("합 : %d", sum);
	}

}
