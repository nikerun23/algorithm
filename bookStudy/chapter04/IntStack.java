package algorithm.bookStudy.chapter04;

import java.util.EmptyStackException;

public class IntStack {
	
	private int max;
	private int ptr;
	private int[] stk;
	
	// 생성자
	public IntStack(int capacity) {
		this.ptr = 0;
		this.max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch(OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}
	
	// 실핼 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	// 실핼 시 예외 : 스택이 가득참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) throw new OverflowIntStackException(); // 스택이 가득참
		return stk[ptr++] = x;
	}
	
	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyStackException {
		if (ptr <= 0) throw new EmptyStackException(); // 스택이 비어 있음
		return stk[--ptr];
	}
	
	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyStackException {
		if (ptr <= 0) throw new EmptyStackException(); // 스택이 비어 있음
		return stk[ptr - 1];
	}
	
	// 스택에서 x를 찾아 인덱스를 반환 (없으면 -1)
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) { // 정상 쪽에서 선형 검색
			if (stk[i] == x) return i; // 검색 성공
		}
		return -1; // 검색 실패
	}
	
	// 스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택의 사이즈를 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어 있는가 ?
	public boolean isEmprty() {
		return ptr <= 0 ;
	}
	
	// 스택이 가득 찼는가 ?
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0) System.out.println("스택이 비어 있습니다");
		else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
	
}