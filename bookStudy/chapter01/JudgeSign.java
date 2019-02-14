package algorithm.bookStudy.chapter01;

import java.util.Scanner;

// 입력한 정수값의 부호를 판단합니다
public class JudgeSign {

    public static void main(String[] args) {
        
        Scanner stdid = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = stdid.nextInt();
        
        if (n > 0) {
            System.out.print("이수는 양수입니다");
        } else if (n < 0) {
            System.out.print("이수는 음수입니다");
        } else {
            System.out.print("이수는 0입니다");
        }
        

    }

}
