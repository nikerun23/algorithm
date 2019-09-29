package algorithm.bookStudy.chapter10;

import java.util.Comparator;

// 이진 검색 트리
public class BinTree<K, V> {
	
	// 하나의 노드 class
	static class Node<K, V> {
		
		K key; // 키값
		V data; // 데이터
		Node<K, V> left; // 왼쪽 자식 노드(포인터)
		Node<K, V> right; // 오른쪽 자식 노드(포인터)
		
		// Node 생성자
		Node(K key, V data, Node<K, V> left, Node<K, V> right) {
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		// 키 값을 반환
		K getKey() {
			return this.key;
		}
		
		// 데이터를 반환
		V getValue() {
			return this.data;
		}
		
		// 데이터를 출력
		void print(){
			System.out.println(data);
		}
	}
	
	// 루트
	private Node<K, V> root;
	// 비교자
	private Comparator<? super K> comparator = null;
	
	// 생성자
	public BinTree() {
		root = null;
	}
	
	//생성자
	public BinTree(Comparator<? super K> c) {
		this();
		comparator = c;
	}
	
	
	
}