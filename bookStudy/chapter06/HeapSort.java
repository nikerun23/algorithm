package algorithm.bookStudy.chapter06;

// 힙 정렬
class HeapSort {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다. 
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  
		a[idx1] = a[idx2];  
		a[idx2] = t;
	}

	// a[left] ~ a[right]를 힙으로 만듭니다. 
	static void downHeap(int[] a, int left, int right) {
		int temp = a[left];				// 루트
		int child;						// 큰 값을 가진 노드
		int parent;						// 부모

		for (parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1;							// 왼쪽 자식
			int cr = cl + 1;									// 오른쪽 자식
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;	// 큰 값을 가진 노드를 자식에 대입 
			if (temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	// 힙 정렬
	static void heapSort(int[] a, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--)	// a[i] ~ a[n-1]를 힙으로 만들기
			downHeap(a, i, n - 1);

		for (int i = n - 1; i > 0; i--) {
			swap(a, 0, i);				// 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
			downHeap(a, 0, i - 1);		// a[0] ~ a[i-1]을 힙으로 만듭니다.
		}
	}

	public static void main(String[] args) {
		int []x = {9,8,7,5,4,2,6,3,1};

		int n = x.length;
		System.out.print("int[] a = {");
		for (int i = 0, len = x.length; i < len; i++) {
			System.out.print(x[i]+", ");
		}
		System.out.println("}");

		heapSort(x, n);	// 배열 x를 힙 정렬합니다.

		System.out.println("오름차순으로 정렬했습니다.");
		
		System.out.print("int[] a = {");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+", ");
		}
		System.out.println("}");
	}
}
