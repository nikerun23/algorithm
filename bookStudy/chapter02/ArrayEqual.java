package algorithm.bookStudy.chapter02;

// 두 배열의 비교
public class ArrayEqual {

	static boolean equals(int[] a, int[] b) {
		
		if (a.length != b.length) return false;
		
		for (int i = 0, len = a.length; i < len; i++) {
			if (a[i] != b[i]) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		int[] a = {23, 7, 10, 2};
		int[] b = {23, 7, 10, 2};
		if (equals(a, b)) {
			System.out.println("배열 a와 배열 b는 같습니다");
		} else {
			System.out.println("배열 a와 배열 b는 다릅니다");
		}
		
	}

}
