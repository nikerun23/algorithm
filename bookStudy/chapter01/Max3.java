package algorithm.bookStudy.chapter01;

import java.util.Scanner;

// 최댓값, 최소값을 구하여 나타냄
public class Max3 {

    // a, b, c의 최댓값을 구하여 반환
    private static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    
    // a, b, c, d의 최댓값을 구하여 반환
    private static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }
    // a, b, c의 최소값을 구하여 반환
    private static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
    // a, b, c, d의 최소값을 구하여 반환
    private static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }
    
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
        
        System.out.println("입력한 정수의 Max 값은 : " + max);
        
        System.out.println("1,2,3 Max 값은 : " + max3(1,2,3));
        System.out.println("1,2,3,4 Max 값은 : " + max4(1,2,3,4));
        System.out.println("1,2,3 Min 값은 : " + min3(1,2,3));
        System.out.println("1,2,3,4 Min 값은 : " + min4(1,2,3,4));

    }

}
