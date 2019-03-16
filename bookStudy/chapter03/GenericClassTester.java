package algorithm.bookStudy.chapter03;

// 제네릭 클래스의 예
public class GenericClassTester {
	
	static class GenericClass<T> {
		// 제네릭 클래스의 파라미터를 T라고 작성합니다
		// 컬렉션 E
		// Map key K, value V
		private T xyz;
		
		public GenericClass(T xyz) {
			this.xyz = xyz;
		}
		
		public T getXyz() {
			return this.xyz;
		}
		
	}

	public static void main(String[] args) {
		
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(123);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());

	}

}
