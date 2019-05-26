package algorithm.bookStudy.chapter06;

// 단순 삽입 정렬
public class InsertionSort {
	
	// 단순 삽입 정렬
	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			// 왼쪽값이 tmp보다 크면 오른쪽으로 값을 이시킨다
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) {
		
		int [] a = {23, 7, 10, 1, 3};

		int n = a.length;
		System.out.print("int[] a = {");
		for (int i = 0, len = a.length; i < len; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		System.out.println("오름 차순으로 정렬합니다");
		
		insertionSort(a, n);			// 배열 a를 단순삽입 정렬
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");

	}

}
