package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 재귀 함수 이해하기
public class RecurX1 {

    // 꼬리 재귀를 제거했습니다
    static void recur(int n) {
    	while(n > 0) {
    		recur(n - 1);
    		System.out.println(n);
    		// recur(n - 2);
    		n = n - 2; // recur(n - 2)와 같습니다
    	}
    }
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        
        recur(x);

    }

}
