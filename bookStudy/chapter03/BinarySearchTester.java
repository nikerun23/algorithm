package algorithm.bookStudy.chapter03;

import java.util.Arrays;
import java.util.Scanner;

// Arrays 이진검색
public class BinarySearchTester {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 키값을 입력
		int key = stdIn.nextInt();
		int idx = Arrays.binarySearch(x, key); // 배열 x에서 키 값이 key인 요소를 검색 Arrays.binarySearch
		
		if (idx < 0) System.out.print("그 값의 요소가 없습니다.");
		else if (idx > 0) System.out.print(key + "는 x[" +idx+ "]에 있습니다");
	}

}
