package algorithm.bookStudy.chapter02;

public class CloneArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.println("a 배열의 값");
		for (int i = 0, len = a.length; i < len; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("b 배열의 값");
		for (int i = 0, len = b.length; i < len; i++) {
			System.out.print(b[i]);
		}
	}

}
