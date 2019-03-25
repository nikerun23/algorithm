package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 팩토리얼을 재귀적으로 구현
public class Factorial {

    // 양의 정수 n의 팩토리얼을 반환합니다
    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n -1); // n! 계승은 n*(n-1)! 와 같다. (3! = 3 * 2! = 6)
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        System.out.printf("%d의 팩토리얼은 %d입니다", x, factorial(x));
        
    }

}
