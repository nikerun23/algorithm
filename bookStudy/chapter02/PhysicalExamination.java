package algorithm.bookStudy.chapter02;

import java.util.Scanner;

public class PhysicalExamination {

	static final int VMAX = 21; // 기력 분포(0.0에서 0.1단위로 21개)
	
	static class PhyscData {
		
		String name; // 이름
		int height; // 키
		double vision; // 시력
		
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
	}
	
	// 키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	
	// 시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for (i = 0; i < dat.length; i++) {
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
		}
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("이현근", 188, 1.0),
				new PhyscData("홍길동", 160, 0.7),
				new PhyscData("문재인", 178, 2.0),
				new PhyscData("트럼프", 170, 1.5),
				new PhyscData("정진성", 180, 1.7),
		};
		
		int[] vdist = new int[VMAX]; // 시력 분포
		
		System.out.println("+++ 신체검사 리스트 +++");
		System.out.println(" 이름      키      시력");
		System.out.println("-----------------------");
		
		for (PhyscData person : x) {
			System.out.printf("%s    %s      %s\n", person.name, person.height, person.vision);
		}
		System.out.println("-----------------------");
		
		// 평균 키
		System.out.printf("평균 키 : %scm\n", aveHeight(x));
			
		distVision(x, vdist); // 시력 분포를 구함
		
		System.out.println("시력 분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
		}
	}
		
}
