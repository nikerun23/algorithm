package algorithm.bookStudy.chapter06;

// 버블 정렬하기 (버전 3)
public class BubbleSort3 {

	// 버블정렬
	static void bubblesort(int[] a, int n) {
		int count = 0; // 검색 횟수
		int k = 0; // a[k]보다 앞쪽은 정렬을 마친 상태
		// a배열 사이즈의 -1 만큼 패스를 실행한다
		while(k < n - 1) {
			int last = n - 1; // 마지막으로 요소를 교환한 위치
			// 패쓰
			for (int j = n - 1; j > k; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
				count++;
			}
			k = last;
		}
		System.out.println("검색 횟수 : " + count);
	}
	
	// 배열의값을 바꿉니다
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	public static void main(String[] args) {
		
		int [] a= {23, 7, 10, 1, 3};
		int n = a.length;
		System.out.print("int[] a = {");
		for (int i = 0, len = a.length; i < len; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		System.out.println("오름 차순으로 정렬합니다");
		
		bubblesort(a, n); // 배열 a를 버블 정렬합니다
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");

	}

}
