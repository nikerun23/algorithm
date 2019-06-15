package algorithm.bookStudy.chapter06;

import algorithm.bookStudy.chapter04.IntStack;

// 퀵 정렬 (비재귀적 정렬, 피벗 알고리즘 구현) 
public class QuickSort4 {
	
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}
	
	// 중앙값의 인덱스를 반환한다
	static int sort3Elem(int[] x, int a, int b, int c) {
		if (x[b] < x[a]) swap(x, a, b);
		if (x[b] > x[c]) swap(x, b, c);
		if (x[b] < x[a]) swap(x, a, b);
		return b;
	}

	// 퀵 정렬 (Stack을 이용하여 그룹 인덱스를 쌓습니다)
	static void quickSort(int[] a, int left, int right) {
		
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmprty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x; // 피벗 변수
			int i = sort3Elem(a, pl, (pl + pr) / 2, pr); // 피벗의 인덱스를 구한다
			x = a[i]; // 피벗
			
			// 첫번째 인덱스와 마지막 인덱스는 정렬을 마쳤기 때문에 제외하고 정렬한다
			swap(a, i, right - 1);
			pl++;
			pr--;

			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);
			
			// 작은 요소의 그룹을 먼저 분할한다
			if (pr - left < right - pl) { // left 0 ~ pr 4, pl 5 ~ right 8
				int temp;
				temp = left;
				left = pl;
				pl = temp;
				
				temp = right;
				right = pr;
				pr = temp;
			}

			if (left < pr) { // 0 < 4
				lstack.push(left); // 왼쪽 그릅 범위의 0
				rstack.push(pr); // 인덱스를 푸시합니다 4
			}
			if (pl < right) { // 5 < 8
				lstack.push(pl); // 오른쪽 그룹 범위의 0 5
				rstack.push(right); // 인덱스를 푸시합니다 4 8
			}
		}
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
		
		quickSort(a, 0, n - 1);			// 배열 a를 퀵 정렬 합니다.
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		
	}

}
