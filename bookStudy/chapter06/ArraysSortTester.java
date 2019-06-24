package algorithm.bookStudy.chapter06;

import java.util.Arrays;

// Arrays.sort 메서드를 사용하여 정렬합니다(퀵 정렬)
public class ArraysSortTester {
	
	public static void main(String[] args) {
        int [] a = {9,8,7,5,4,2,6,3,1};

        System.out.print("int[] a = {");
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("}");
        System.out.println("오름 차순으로 정렬합니다");
        
        Arrays.sort(a);        // 배열 a를 정렬합니다.
        
        System.out.print("int[] a = {");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("}");

    }

}
