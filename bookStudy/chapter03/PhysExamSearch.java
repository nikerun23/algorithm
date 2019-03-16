package algorithm.bookStudy.chapter03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 신체검사 배열에서 이진검색
public class PhysExamSearch {

	// 신체검사 데이터를 정의합니다
	static class PhysData {
		
		private String name; // 이
		private int height; // 
		private double vision; // 시
		
		// 생성자
		public PhysData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// 문자열을 반환하는 메서드(정보 확인용)
		public String toString() {
			return name + " " + height + " " + vision;
		}

		// 오름차순으로 정렬하기 위한 Comparator
		public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();
		// 내림차순으로 정렬하기 위한 Comparator
		public static final Comparator<PhysData> VISION_ORDER = new VisionOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhysData> {

			@Override
			public int compare(PhysData o1, PhysData o2) {
				return (o1.height > o2.height) ? 1 : // o1이 o2보다 크면 1
						(o1.height < o2.height) ? -1 : 0; // o1이 o2보다 작으면 -1, o1이 o2보다 같으면 0
			}
			
		}
		
		private static class VisionOrderComparator implements Comparator<PhysData> {
			
			@Override
			public int compare(PhysData o1, PhysData o2) {
				return (o1.vision > o2.vision) ? 1 : // o1이 o2보다 크면 1
					(o1.vision < o2.vision) ? -1 : 0; // o1이 o2보다 작으면 -1, o1이 o2보다 같으면 0
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		PhysData[] x = { // 자연정렬된 배열
				new PhysData("이유희", 160, 0.2)
				,new PhysData("유시민", 173, 0.5)
				,new PhysData("문재인", 180, 2.0)
				,new PhysData("이현근", 188, 2.3)
				};
		
		System.out.print("몇 cm인 사람을 찾습니까 ? : ");
		int height = stdIn.nextInt(); // 키갑 입력
		int idx = Arrays.binarySearch(
				x // 배열 x에서
				, new PhysData("", height, 0.0) // 키가 height인 요소를
				, PhysData.HEIGHT_ORDER // HEIGHT_ORDER에 의해 검색
				);
		
		if (idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("요소가 x[" + idx + "]에 있습니다");
			System.out.println("찾은 데이터 : " + x[idx]); // toString
		}
		
		System.out.print("어떠한 시력의 사람을 찾습니까 ? : ");
		double vision = stdIn.nextDouble(); // 키갑 입력
		idx = Arrays.binarySearch(
				x // 배열 x에서
				, new PhysData("", 0, vision) // 시력이 vision인 요소를
				, PhysData.VISION_ORDER // VISION_ORDER에 의해 검색
				);
		
		if (idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("요소가 x[" + idx + "]에 있습니다");
			System.out.println("찾은 데이터 : " + x[idx]); // toString
		}

	}

}
