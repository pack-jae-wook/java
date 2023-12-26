package test07_1;

import java.util.Arrays;

public class TwoDimension2 {

	public static void main(String[] args) {
		
		//2차원 배열 예제
		//학점의 합계와 평균 구하기

		double score[][]= {
				{3.3,3.4},//1학년 1,2 학기 평점-> score[0]행
				{3.5,3.6},//2학년 1,2 학기 평점-> score[1]행
				{3.7,4.0},//3학년 1,2 학기 평점-> score[2]행
				{4.1,4.2},//4학년 1,2 학기 평점-> score[3]행
		};
		
		
		System.out.println("배열 요소값 출력 =" + Arrays.deepToString(score));
		System.out.println("--------------------");
		
		double sum = 0;
		int g;
		int s;
		
		double sum1 = 0;
		double avg1 = 0;
		
		
		for (g = 0; g < score.length; g++) {
			
			
			System.out.println("학년구분 --------------" + (g+ 1)+"학년");
			
			
			for (s = 0; s < score[g].length; s++) {
				
				System.out.print(score[g][s]);
				System.out.println("---["+g+"]["+s+"]");
				sum += score[g][s];
				sum1 += score[g][s];
				
			}			
			System.out.println((g+1) + "학년 평점 합계 = " + sum1);
			avg1 = sum1/s;
			System.out.println((g+1) + "학년 평점 평균 = " + avg1);
			sum1=0;
			
		

			
		}
		System.out.println("4학년 전체 평점 합계 = " + sum);
		System.out.println("4학년 전체 평점 합계 = " + sum / 8.0);
		System.out.println("--------------------");
	}
	

}
