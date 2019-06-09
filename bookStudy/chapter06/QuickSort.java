package algorithm.bookStudy.chapter06;

// 퀵 정렬
public class QuickSort {
	
	// 배열 요소 a[idx1]와 a[idx2]의 값을 바꿉니다
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	static void quickSort(int[]a, int left, int right) {
		int pl = left; // 왼쪽 커서
		int pr = right; // 오른쪽 커서
		int x = a[(pl + pr) / 2]; // 피벗(가운데 위치한 값)
		
		do {
			while (a[pl] < x) pl++; //x(피벗) 보다 큰값을 찾을때까지 오른쪽으로 이동한다
			while (a[pr] > x) pr--; //x(피벗) 보다 작은값을 찾을때까지 왼쪽으로 이동한다
			if (pl <= pr) { // pl의 값과 pr의 값을 바꾼다
				swap(a, pl++, pr--); // 값을 교환 후 다시 한칸씩 이동한다
			}
		} while (pl <= pr);
		// 피벗으로 파티션 한 경우 {1, 3, 2, 4, 5, 7, 6, 8, 9}
		if (left < pr) quickSort(a, left, pr); // 재귀 호출로 피벗[3]의 왼쪽 그룹을 정렬
		if (pl < right) quickSort(a, pl, right); // 재귀 호출로 피벗[5]의 오른쪽 그룹을 정렬
		
	}

	public static void main(String[] args) {
		
		int [] a = {1,8,7,4,5,2,6,3,9};

		int n = a.length;
		System.out.print("int[] a = {");
		for (int i = 0, len = a.length; i < len; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		System.out.println("오름 차순으로 정렬합니다");
		
		quickSort(a, 0, n - 1);			// 배열 a를 나눕니다
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");

	}

}
