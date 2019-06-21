package algorithm.bookStudy.chapter06;

// 병합 정렬
public class MergeSort {
	
	static int[] buff;	// 작업용 배열

	// a[left] ~ a[right]를 재귀적으로 병합 정렬 
	static void __mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;

			__mergeSort(a, left, center);			// 배열의 앞부분을 병합 정렬합니다.
			__mergeSort(a, center + 1, right);		// 배열의 뒷부분을 병합 정렬합니다.

			for (i = left; i <= center; i++)
				buff[p++] = a[i];

			while (i <= right && j < p)
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];

			while (j < p)
				a[k++] = buff[j++];
		}
	}

	// 병합 정렬
	static void mergeSort(int[] a, int n) {
		buff = new int[n];				// 작업용 배열을 생성합니다.

		__mergeSort(a, 0, n - 1);		// 배열 전체를 병합 정렬합니다.

		buff = null;					// 작업용 배열을 해제합니다.
	}

	public static void main(String[] args) {
		int [] a = {9,8,7,5,4,2,6,3,1};

		int n = a.length;
		System.out.print("int[] a = {");
		for (int i = 0, len = a.length; i < len; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		System.out.println("오름 차순으로 정렬합니다");
		
		mergeSort(a, n);		// 배열 x를 병합 정렬합니다.
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
	}

}
