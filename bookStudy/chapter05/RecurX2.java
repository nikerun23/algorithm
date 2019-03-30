package algorithm.bookStudy.chapter05;

import java.util.Scanner;

import algorithm.bookStudy.chapter04.IntStack;

// 재귀 함수 비재귀적으로 이해하기
public class RecurX2 {

	// 꼬리 재귀를 제거했습니다
    static void recur(int n) {
    	
    	IntStack s = new IntStack(n);
    	while(true) {
    		if (n > 0) {
    			s.push(n); // n의 값을 임시저장
    			n = n - 1; // recur(n - 1)와 같습니다
    			continue; // while문의 처음으로 돌아감
    		}
    		if (s.isEmprty() != true) {
    			n = s.pop(); // 4 3 2 1 상향식 분석으로 꺼낸다
    			System.out.println(n);
    			n = n - 2; // recur(n - 2)와 같습니다
    			continue; // while문의 처음으로 돌아감
    		}
    		break;
    	}
    }
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        
        recur(x);

    }

}
