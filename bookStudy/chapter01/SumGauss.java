package algorithm.bookStudy.chapter01;

import java.util.Scanner;

// 1부터 n까지의 합을 구함
public class SumGauss {

    public static void main(String[] args) {
        
        Scanner stdid = new Scanner(System.in);
        System.out.print("n의 값을 입력하세요 : ");
        int n = stdid.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while(i <= n) {
         sum += i;
         i++;
        }
        System.out.println("1에서 n까지의 합은 : " + sum);
        
        sum = 0;
        i = 1;
        
        sum = (i + n) * (n / 2) + (n % 2 == 1 ? (n+1)/2 : 0); // 가우스의 합 구하기
        System.out.println("가우스의 덧셈 - 1에서 n까지의 합은 : " + sum);
        
    }

}
