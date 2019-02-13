package algorithm.bookStudy.chapter01;

import java.util.Scanner;

public class Max3 {

    public static void main(String[] args) {
        
        System.out.println("세 정수의 최댓값을 구합니다");
        
        Scanner stdid = new Scanner(System.in);
        
        System.out.print("a : ");
        int a = stdid.nextInt();
        System.out.print("b : ");
        int b = stdid.nextInt();
        System.out.print("c : ");
        int c = stdid.nextInt();
        
        int max = a;
        
        if (b > max) max = b;
        if (c > max) max = c;
        
        System.out.print("Max 값은 : " + max);

    }

}
