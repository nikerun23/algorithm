package algorithm.bookStudy.chapter01;

import java.util.Scanner;

// 세 정수값의 중앙값을 구하여 나타냄 (모든 조합의 대소관계에 대하여 검증)
public class Med3 {
    
    // a, b, c의 중앙값을 구하여 반환
    private static int med3(int a, int b, int c) {
        
        int med = a;

        if (a >= b)
            if (b >= c)
                med = b;
            else if (a <= c)
                med = a;
            else
                med = c;
         else if (a > c)
                med = a;
         else if (b > c)
             med = c;
         else
             med = b;
        
        return med;
    }

    public static void main(String[] args) {
        
        System.out.println("세 정수의 중앙값을 구합니다");
        
        Scanner stdid = new Scanner(System.in);
        
        System.out.print("a : ");
        int a = stdid.nextInt();
        System.out.print("b : ");
        int b = stdid.nextInt();
        System.out.print("c : ");
        int c = stdid.nextInt();
        
        System.out.println("입력한 정수의 med 값은 : " + med3(a,b,c));
        
        
    }
}
