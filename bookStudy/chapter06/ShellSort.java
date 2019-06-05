package algorithm.bookStudy.chapter06;

// 셸 정렬(버전 1)
public class ShellSort {
    
    //셸 정렬
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }

    public static void main(String[] args) {
        int [] a = {23, 7, 10, 1, 3};

        System.out.print("int[] a = {");
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("}");
        System.out.println("오름 차순으로 정렬합니다");
        
        shellSort(a, a.length); // 배열 a를 셸 정렬
        
        System.out.print("int[] a = {");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("}");
    }

}
