package algorithm.bookStudy.chapter05;

import java.util.Scanner;

// 하노이의 탑(비재귀적으로 구현)
// 모든 원반은 크기가 다르고 세번째 기둥으로 1개씩만 최소한의 횟수로 옮겨라
public class HanoiEx {

    static void move(int no, int x, int y) {
        
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100]; // 스택
        int ptr = 0; // 스택 포인터
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xstk[ptr] = x; // x의 값을 푸시
                ystk[ptr] = y; // y의 값을 푸시
                sstk[ptr] = sw; // sw의 값을 푸시
                ptr++;
                no = no - 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("[%d]를 %d기둥에서 %d기둥으로 옮김\n", no, x, y);

            if (sw == 1 && no > 1) {
                xstk[ptr] = x; // x의 값을 푸시
                ystk[ptr] = y; // y의 값을 푸시
                sstk[ptr] = sw; // sw의 값을 푸시
                ptr++;
                no = no - 1;
                x = 6 - x - y;
                if (++sw == 2)
                    sw = 0;
                continue;
            }
            do {
                if (ptr-- == 0) // 스택이 텅 빔
                    return;
                x = xstk[ptr]; // 값을 저장하고 있는 x를 팝
                y = ystk[ptr]; // 값을 저장하고 있는 y를 팝
                sw = sstk[ptr] + 1; // 값을 저장하고 있는 sw를 팝
                no++;
            } while (sw == 2); // 1기둥에 쌓인 n 개를 3기둥에 옮김
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
