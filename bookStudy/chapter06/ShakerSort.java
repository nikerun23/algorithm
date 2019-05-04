package algorithm.bookStudy.chapter06;

public class ShakerSort {
	
	// 배열의 요소 a[idx1]과 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 양방향 버블정렬(셰이커정렬)
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
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
		
		shakerSort(a, a.length); // 배열 a를 양방향 버블정렬
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
	}

}
