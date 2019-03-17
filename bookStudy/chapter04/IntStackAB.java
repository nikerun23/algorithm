package algorithm.bookStudy.chapter04;

import java.util.EmptyStackException;

public class IntStackAB {
	
	private int max; // 스택의 용량
	private int ptrA; // 스택 포인터 A
	private int ptrB; // 스택 포인터 B
	private int[] stk; // 스택 본체
	
	// 생성자
	public IntStackAB(int capacity) {
		this.ptrA = 0; // 스택 포인터 A
		this.ptrB = capacity - 1; // 스택 포인터 B
		this.max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch(OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}
	
	public enum AorB {
		StackA, StackB;
	};
	
	// 실핼 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	// 실핼 시 예외 : 스택이 가득참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	// 스택에 x를 푸시
	public int push(AorB sw, int x) throws OverflowIntStackException {
		if (ptrA >= ptrB) throw new OverflowIntStackException(); // 스택이 가득참
		switch(sw) {
			case StackA:
				stk[ptrA++] = x;
				break;
			case StackB:
				stk[ptrB--] = x;
				break;
		}
		return x;
	}
	
	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop(AorB sw) throws EmptyStackException {
		int x = 0;
		switch(sw) {
			case StackA:
				if (ptrA <= 0) throw new EmptyStackException(); // 스택이 비어 있음
				x = stk[--ptrA];
				break;
			case StackB:
				if (ptrB >= max - 1) throw new EmptyStackException(); // 스택이 비어 있음
				x = stk[++ptrB];
				break;
		}
		return x;
	}
	
	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek(AorB sw) throws EmptyStackException {
		int x = 0;
		switch(sw) {
			case StackA:
				if (ptrA <= 0) throw new EmptyStackException(); // 스택이 비어 있음
				x = stk[ptrA - 1];
				break;
			case StackB:
				if (ptrB >= max - 1) throw new EmptyStackException(); // 스택이 비어 있음
				x = stk[ptrB + 1];
				break;
		}
		return x;
	}
	
	// 스택에서 x를 찾아 인덱스를 반환 (없으면 -1)
	public int indexOf(AorB sw, int x) {
		switch(sw) {
			case StackA:
				for (int i = ptrA - 1; i >= 0; i--) { // 정상 쪽에서 선형 검색
					if (stk[i] == x) return i; // 검색 성공
				}
				break;
			case StackB:
				for (int i = ptrB + 1; i < max; i++) { // 정상 쪽에서 선형 검색
					if (stk[i] == x) return i; // 검색 성공
				}
				break;
		}
		return -1; // 검색 실패
	}
	
	// 스택을 비움
	public void clear(AorB sw) {
		switch(sw) {
			case StackA:
				ptrA = 0;
				break;
			case StackB:
				ptrB = max - 1;
				break;
		}
	}
	
	// 스택의 용량을 반환 (A와 B의 합계)
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여있는 데이터 수를 반환
	public int size(AorB sw) {
		switch(sw) {
			case StackA:
				return ptrA;
			case StackB:
				return max - ptrB - 1;
		}
		return 0;
	}
	
	// 스택이 비어 있는가 ?
	public boolean isEmprty(AorB sw) {
		switch (sw) {
			case StackA:
				return ptrA <= 0;
			case StackB:
				return ptrB >= max - 1;
		}
		return true;
	}
	
	// 스택이 가득 찼는가 ?
	public boolean isFull() {
		return ptrA >= ptrB + 1;
	}
	
	// 스택의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump(AorB sw) {
		switch (sw) {
			case StackA:
				if (ptrA <= 0)
					System.out.println("스택이 비었습니다.");
				else {
					for (int i = 0; i < ptrA; i++)
						System.out.print(stk[i] + " ");
					System.out.println();
				}
				break;
			case StackB:
				if (ptrB >= max - 1)
					System.out.println("스택이 비었습니다.");
				else {
					for (int i = max - 1; i > ptrB; i--)
						System.out.print(stk[i] + " ");
					System.out.println();
				}
				break;
		}
	}
	
}
