package algorithm.bookStudy.chapter06;

import algorithm.bookStudy.chapter04.IntStack;

// 퀵 정렬 (비재귀적 정렬) 
public class QuickSort2 {
	
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	// 퀵 정렬(배열을  나누는 과정을 출력합니다)
	static void quickSort(int[] a, int left, int right) {
		
		IntStack lstack = new IntStack(right - left + 1); // 커서의 크기를 설정한다
		IntStack rstack = new IntStack(right - left + 1); // 커서의 크기를 설정한다
		
		lstack.push(left); // 스택에 left 인덱스 값을 쌓는다
		rstack.push(right); // 스택에 right 인덱스 값을 쌓는다
		
		while(lstack.isEmprty() != true) {
			int pl = left = lstack.pop();	// 왼쪽 커서
			int pr = right = rstack.pop();	// 오른쪽 커서
			int x = a[(left + right) / 2];		// 피벗

			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left); // 왼쪽 그릅 범위의
				rstack.push(pr); // 인덱스를 푸시합니다
			}
			if (pl < right) {
				lstack.push(pl); // 오른쪽 그룹 범위의
				rstack.push(right); // 인덱스를 푸시합니다
			}
		}
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
		
		quickSort(a, 0, n - 1);			// 배열 a를 퀵 정렬 합니다.
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		
	}

}
