package algorithm.bookStudy.chapter01;

import java.util.Scanner;

// 입력받은 값 사이의 합을 구함
public class SumOf {

    private static int sumof(int a, int b) {
        
        int sum = 0;
        
        if (a == b) {
            sum = a;
        } else {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            sum = (a + b) * (b / 2) + (b % 2 == 1 ? (b+1)/2 : 0); // 가우스의 합 구하기
        }
        
        return sum;
        
    }
    
    public static void main(String[] args) {
        
        Scanner stdid = new Scanner(System.in);
        
        System.out.print("a의 값을 입력하세요 : ");
        int a = stdid.nextInt();
        System.out.print("b의 값을 입력하세요 : ");
        int b = stdid.nextInt();
        
        System.out.println(String.format("%s에서 %s까지의 합은 : %s", a, b, sumof(a, b)));
        
    }
}
