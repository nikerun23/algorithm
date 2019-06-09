package algorithm.bookStudy.chapter06;

// 배열을 나눕니다
public class Partition {

	// 배열 요소 a[idx1]와 a[idx2]의 값을 바꿉니다
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	// 배열을 나눕니다
	static void partition(int[]a, int n) {
		int pl = 0; // 왼쪽 커서
		int pr = n - 1; // 오른쪽 커서
		int x = a[n / 2]; // 피벗(가운데 위치한 값)
		
		do {
			while (a[pl] < x) pl++; //x(피벗) 보다 큰값을 찾을때까지 오른쪽으로 이동한다
			while (a[pr] > x) pr--; //x(피벗) 보다 작은값을 찾을때까지 왼쪽으로 이동한다
			if (pl <= pr) { // pl의 값과 pr의 값을 바꾼다
				swap(a, pl++, pr--); // 값을 교환 후 다시 한칸씩 이동한다
			}
		} while (pl <= pr);
		
		System.out.printf("피벗의 값은 %s입니다\n", x);
		
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
		
		partition(a, n);			// 배열 a를 나눕니다
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");

	}

}
