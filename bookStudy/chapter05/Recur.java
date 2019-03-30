package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 재귀 함수 이해하기
public class Recur {

    // 재귀 함수
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }
    
    // 재귀 함수
    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
        // 상향식 분석
        /* n = 4
		 * recur(4) 0: recur(2)  recur(3)
		 * recur(2) 1: recur(0) 2 recur(1) = 2
		 * recur(1) 2: recur(-1) 1 recur(0) = 21
		 * recur(4) 0: recur(2) 4 recur(3) = 214
		 * recur(1) 1: recur(-1) 1 recur(0) = 2141
		 * recur(3) 2: recur(1) 3 recur(2) = 21413
		 * recur(2) 2: recur(0) 2 recur(1) = 214132
		 * recur(1) 2: recur(-1) 1 recur(0) = 2141321
		 * 
		 */
    }
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        
        recur2(x);

    }

}
