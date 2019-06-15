package algorithm.bookStudy.chapter06;

import algorithm.bookStudy.chapter04.IntStack;

//퀵 정렬 (비재귀적 정렬, 분할 과정을 출력)
public class QuickSortVerbose {
	
	// 배열의 요소 a[idx1]과 a[idx2]를 교환
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}

		// 퀵정렬(비재귀버전)
		static void quickSort(int[] a, int left, int right) {
			IntStack lstack = new IntStack(right - left + 1);
			IntStack rstack = new IntStack(right - left + 1);

			lstack.push(left);
			rstack.push(right);
			System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, right);
			System.out.print("Lstack:");
			lstack.dump();
			System.out.print("Rstack:");
			rstack.dump();

			while (lstack.isEmprty() != true) {
				int pl = left = lstack.pop(); // 왼쪽 커서
				int pr = right = rstack.pop(); // 오른쪽 커서
				int x = a[(left + right) / 2]; // 피벗은 중앙의 요소
				System.out.printf("스택에서 분할하는 문제를 꺼냈습니다.a[%d]~a[%d]를 분할합니다.\n", left, right);

				do {
					while (a[pl] < x)
						pl++;
					while (a[pr] > x)
						pr--;
					if (pl <= pr)
						swap(a, pl++, pr--);
				} while (pl <= pr);

				if (left < pr) {
					lstack.push(left); // 머리쪽 그룹의 범위
					rstack.push(pr); // (index)를 푸시
					System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, pr);
					System.out.print("Lstack:");
					lstack.dump();
					System.out.print("Rstack:");
					rstack.dump();
				}
				if (pl < right) {
					lstack.push(pl); // 꼬리쪽그룹의 범위
					rstack.push(right); // (index)를 푸시
					System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", pl, right);
					System.out.print("Lstack:");
					lstack.dump();
					System.out.print("Rstack:");
					rstack.dump();
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
