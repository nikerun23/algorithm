package algorithm.bookStudy.chapter02;

public class RotateArray {

    static int[] rotate(int[] arr, int cnt) {
        
        int arrLen = arr.length;
        
        if (cnt % arrLen == 0) { // 배열크기와 같은 회전수는 동일하다
            return arr;
        } else if (arrLen < cnt) { // 배열크기보다 큰 회전수 처리
            cnt = cnt % arrLen;
        }
        
        int[] arrA = new int[arrLen];
        int stIdx = 0; // 0인덱스부터 채우면서 증감
        
        for(int i = 0; i < arrLen; i++) {
            if (i >= arrLen-cnt) { // 배열끝을 채웠으면 0인덱스부터 채우기
                arrA[stIdx++] = arr[i];
            } else {
                arrA[i+cnt] = arr[i];
            }
        }
        return arrA;
        
    }
    
    public static void main(String[] args) {

        int[] arrA = {1, 2, 3, 4, 5, 6, 7};
        
        int[] arrB = rotate(arrA, 1);
        
        for (int i = 0, len = arrA.length; i < len; i++) {
            System.out.print(arrA[i]);
        }
        System.out.println();
        for (int i = 0, len = arrB.length; i < len; i++) {
            System.out.print(arrB[i]);
        }
        
    }

}
