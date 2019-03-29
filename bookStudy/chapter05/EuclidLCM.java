package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 유클리드 호제법으로 최소공배수 구하기
public class EuclidLCM {
    
    // 정수의 x, y의 최대공약수를 구하여 반환합니다
    public static int gcd(int x, int y) {
        while(y != 0) { // x % y 나누어 떨어질때 까지 반복합니다
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x; // 최대공약수
    }
    
    // 정수의 x, y의 최소공배수를 구하여 반환합니다
    public static int lcm(int x, int y) {
        
        // (최소공배수 * 최대공약수 = x * y)
        return x * y / gcd(x, y); // 최소공배수(lcm) = x * y / 최대공약수
        
    }

    public static void main(String[] args) {

        System.out.println("톱니 바퀴가 맞물리는 최소의 회전수를 구합니다.");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("A 톱니바퀴 갯수를 입력하세요 : ");
        int x = stdIn.nextInt();
        System.out.print("B 톱니바퀴 갯수를 입력하세요 : ");
        int y = stdIn.nextInt();
        int lcm = lcm(x, y); // 
        System.out.printf("최소 공배수는 %d입니다\n", lcm);
        System.out.printf("%d개의 A 톱니 바퀴가 맞물리는 최소의 회전수 : %d회\n", x, lcm / x);
        System.out.printf("%d개의 B 톱니 바퀴가 맞물리는 최소의 회전수 : %d회\n", y, lcm / y);
    }

}
