package algorithm.bookStudy.chapter06;

// 버블 정렬하기 (버전 1)
public class BubbleSortR {

	// 버블정렬
	static void bubblesort(int[] a, int n) {
		// a배열 사이즈의 -1 만큼 패스를 실행한다
		for(int i = n - 1; i > 0; i--) {
			// 패쓰
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
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
