package algorithm.bookStudy.chapter03;

import java.util.Scanner;

// 선형 검색 (보초법)
public class SeqSearch {

	// 요솟수가 n인 배열a에서 key와 같은 요소를 선형 검색합니다
	static int seqSearch(int[]a, int n, int key) {
		
		a[n] = key; // 보초를 추가
		int i = 0;
		while (true) {
			if (key == a[i]) break;
			i++;
		}
		return n == i ? -1 : i; // 인덱스를 반환 (인덱스 마지막은 보초법이므로 -1 반환)
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = stdIn.nextInt();
		int[] x = new int[n+1]; // 요솟수가 n인 배열 (보초법을 위한 +1)
		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 키값을 입력
		int key = stdIn.nextInt();
		int idx = seqSearch(x, n, key); // 배열 x에서 키 값이 key인 요소를 검색
		
		if (idx == -1) System.out.print("그 값의 요소가 없습니다.");
		else if (idx != -1) System.out.print(key + "는 x[" +idx+ "]에 있습니다");
		
	}

}
