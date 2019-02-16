package algorithm.bookStudy.chapter02;

// 배열요소 역순 정렬
public class ReverseArray {

	static void printArr(int[] arr, String title) {
		System.out.print(title + " : {");
		for (int i = 0, len = arr.length; i < len; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println("}");
	}
	
	static int[] swapArr(int[] arr) {
		int cnt = arr.length / 2;
		int endIdx = arr.length - 1;
		for (int i = 0; i < cnt; i++) {
			int temp = arr[i];
			arr[i] = arr[endIdx - i];
			arr[endIdx - i] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {

		int[] arr = {12, 77, 10, 7, 50, 9, 99};
		
		printArr(arr, "arr");
		// 배열요소 역순 정렬
		arr = swapArr(arr);
		printArr(arr, "Reverse arr");
	}

}
