package algorithm.bookStudy.chapter06;

import java.util.Scanner;

// 단순 삽입 정렬(이진탑색)
public class BinInsertionSort {

	static void binInsertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int pl = 0; // 검색범위 맨 앞의 인덱스
			int pr = i - 1; // 검색범위 맨 뒤의 인덱스
			int pc; // 〃 중앙의 인덱스
			int pd; // 삽입하는 위치의 인덱스

			do {
				pc = (pl + pr) / 2;
				if (a[pc] == key) // 검색성공
					break;
				else if (a[pc] < key)
					pl = pc + 1;
				else
					pr = pc - 1;
			} while (pl <= pr);
			pd = (pl <= pr) ? pc + 1 : pr + 1;

			for (int j = i; j > pd; j--)
				a[j] = a[j - 1];
			a[pd] = key;
		}
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
		
		binInsertionSort(a, n); // 배열 a를 이진삽입정렬
		
		System.out.print("int[] a = {");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
	}
}
