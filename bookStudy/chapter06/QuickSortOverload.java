package algorithm.bookStudy.chapter06;

// 퀵 정렬
public class QuickSortOverload {
    
    // 배열의 요소 a[idx1]과 a[idx2]를 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 퀵정렬(left, right … 머리&꼬리요소의 index)
    static void quickSort(int[] a, int left, int right) {
        int pl = left; // 왼쪽 커서
        int pr = right; // 오른쪽 커서
        int x = a[(pl + pr) / 2]; // 피벗 (중앙의 요소)

        do {
            while (a[pl] < x)
                pl++;
            while (a[pr] > x)
                pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr)
            quickSort(a, left, pr);
        if (pl < right)
            quickSort(a, pl, right);
    }

    // 퀵정렬(n … 요솟수)
    static void quickSort(int[] a, int n) {
        quickSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int [] a = {1,8,7,4,5,2,6,3,9};

        int n = a.length;
        System.out.print("int[] a = {");
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("}");
        System.out.println("오름 차순으로 정렬합니다");
        
        quickSort(a, n); // 배열 x를 퀵정렬
        
        System.out.print("int[] a = {");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("}");
    }

}
