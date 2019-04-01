package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 하노이의 탑
// 모든 원반은 크기가 다르고 세번째 기둥으로 1개씩만 최소한의 횟수로 옮겨라
public class Hanoi {

    static void move(int no, int x, int y) {
        
        if (no > 1) {
            move(no-1, x, 6-x-y); // 6-x-y = 2 는 중간기등의 번호
        }
        System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 옮김\n", no, x, y);
        if (no > 1) {
            move(no-1, 6-x-y, y);
        }
        
    }
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.println("하노이의 탑");
        System.out.print("원반 갯수 : ");
        int x = stdIn.nextInt();
        
        move(x, 1, 3);

    }

}
