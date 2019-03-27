package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 유클리드 호제법 비재귀적으로 최대공약수 구하기
public class EuclidGCDEx {
    
    // 정수의 x, y의 최대공약수를 구하여 반환합니다
    public static int gcd(int x, int y) {
        while(y != 0) { // x % y 나누어 떨어질때 까지 반복합니다
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x; // 최대공약수
    }

    public static void main(String[] args) {

        System.out.println("두 정수의 최대 공약수를 구합니다.");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int y = stdIn.nextInt();
        
        System.out.printf("최대 공약수는 %d입니다", gcd(x, y));
    }

}
