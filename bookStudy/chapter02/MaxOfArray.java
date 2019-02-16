package algorithm.bookStudy.chapter02;

public class MaxOfArray {

	public static void main(String[] args) {

		int[] arr = {7, 20, 70, 1, 9};
		int max = arr[0];
		for (int i = 1, len = arr.length; i < len; i++) {
			if (max < arr[i]) max = arr[i];
		}
		
		System.out.println("배열의 Max값은 : " + max);
	}

}
