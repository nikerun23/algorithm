package algorithm.bookStudy.chapter04;

import java.util.Scanner;

// 원하는 갯수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장
public class LastNElements {

	public static void main(String[] args) {
		
		Scanner stcIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; // 입력 받은 값을 저장
		int cnt = 0; // 입력한 갯수
		int retry; // 다시 한번 ?
		
		System.out.println("정수를 입력하세요");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = stcIn.nextInt();
			System.out.print("계속 할가요 ? (몌.1 / 아니요.0) : ");
			retry = stcIn.nextInt();
		} while(retry == 1);
		
		
		// 출력할 때는 입력한 갯수가 12개일때를 감안하여 계산해야 한다
		int i = cnt - N; // cnt = 12
		if (i < 0) i = 0;
		
		for (; i < cnt; i++)
			System.out.printf("%d번째의 정수 = %d\n", i + 1, a[i % N]); // 3번째 정수 = a[2]
		
	}

}
