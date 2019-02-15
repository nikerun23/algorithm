package algorithm.bookStudy.chapter02;

public class IntArray {

    public static void main(String[] args) {
        
        int[] a = new int[5];
        
        a[1] = 37;
        a[2] = 7;
        a[4] = a[1] * 2;
        
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.println(String.format("a[%s] = %s",i, a[i]));
        }

    }

}
