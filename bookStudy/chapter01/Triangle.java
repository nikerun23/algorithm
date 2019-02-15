package algorithm.bookStudy.chapter01;

import java.util.Scanner;

public class Triangle {

    
    private static void triangleLB(int n) {
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    private static void spira(int n) {
        
        for (int i = 1; i <= n; i++) {                  // i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++)        // n-i+1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)  // (i-1)*2+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println();                       // 개행(줄변환)
        }
        
    }
    
    private static void npira(int n) {
        
        for (int i = 1; i <= n; i++) {                  // i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++)        // n-i+1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)  // (i-1)*2+1개의 '*'를 나타냄
                System.out.print(i % 10);
            System.out.println();                       // 개행(줄변환)
        }
        
    }
    
    public static void main(String[] args) {

        System.out.print("몇단 삼각형입니까 : ");
        Scanner stdid = new Scanner(System.in);
        int n = stdid.nextInt();
        
        triangleLB(n);
        spira(5);
        npira(5);
        
        
    }

}
