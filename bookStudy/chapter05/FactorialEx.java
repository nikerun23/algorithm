package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 팩토리얼을 비재귀적으로 구현
public class FactorialEx {

    // 양의 정수 n의 팩토리얼을 반환합니다
    public static int factorial(int n) {
        int fact = 1;
        while(n > 1) // 1은 곱할 필요가 없다
            fact *= n--;
        return fact;
    }
    
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        System.out.printf("%d의 팩토리얼은 %d입니다", x, factorial(x));
        
    }

}
