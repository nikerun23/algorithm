package algorithm.bookStudy.chapter01;

import java.util.Scanner;

// 두자리의 정수를 입력받는 드모르간 법칙
public class Digits {
    
    public static void main(String[] args) {
        
        Scanner stdid = new Scanner(System.in);
        int no = 0;
        
        do {
            System.out.print("2자리의 정수를 입력하세요 : ");
            no = stdid.nextInt();
        } while (!(no >= 10 && no <= 99)); // 10~99 사이의 값
        
        System.out.println(String.format("입력한 값 : %s", no));
        
    }

}
