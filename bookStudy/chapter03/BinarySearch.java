package algorithm.bookStudy.chapter03;

import java.util.Scanner;

// 이진검색
public class BinarySearch {
	
	// 요숫수가 n인 배열 a에서 key와 같은 모든 요소를 검색합니다.
	static int searchIdx(int[] a, int key) {
		
		int[] idx = new int[a.length];
		int count = 0;
		
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] == key) {
				idx[count] = a[i];
				count++;
			}
		}
		
		return count;
	}

	// 요숫수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			if (a[pc] == key)
				return pc; // 검색 성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽으로 줄임
			else
				pr = pc - 1; // 검색 범위를 앞쪽으로 줄임
		} while (pl <= pr);
		return -1; // 검색 실패
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = stdIn.nextInt();
		int[] x = new int[n]; // 요솟수가 n인 배열
		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 키값을 입력
		int key = stdIn.nextInt();
//		int idx = binSearch(x, n, key); // 배열 x에서 키 값이 key인 요소를 검색
		int count = searchIdx(x, key); // 배열 x에서 키 값이 key인 요소의 갯수를 검색

		if (count == 0) System.out.print("그 값의 요소가 없습니다.");
		else if (count > 0) System.out.print(key + "는 "+count+"개 있습니다");
//		if (idx == -1) System.out.print("그 값의 요소가 없습니다.");
//		else if (idx != -1) System.out.print(key + "는 x[" +idx+ "]에 있습니다");
		
	}

}
