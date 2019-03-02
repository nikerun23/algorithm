package algorithm.bookStudy.chapter03;

import java.util.Scanner;

public class SeqSearch {

	// 요솟수가 n인 배열a에서 key와 같은 요소를 선형 검색합니다
	static int seqSearch(int[]a, int n, int key) {
		int i = 0;
		while(true) {
			if (i == n) return -1; // 검색 실패 -1을 반환
			if (a[i] == key) return i; // 검색 성공 인덱스를 반환
			i++;
		}
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = stdIn.nextInt();
		int[] x = new int[n]; // 요솟수가 n인 배열
		
		for (int i = 0; i < x.length; i++) {
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
