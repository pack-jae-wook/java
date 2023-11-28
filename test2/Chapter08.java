package test2;

import java.util.Scanner;

public class Chapter08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//제어문
		//조건문 : 1)if문 : 조건이 참일때만 수행하고 조건이 거짓이면 수행하지 않는다.!!
		//조건 작성 방법 : 비교대상  관계(비교)연산자  비교할기준값  -> 결과는 참(true)/ 거짓(false)
		//형식) if(조건식) { 조건이 참일때 수행할 내용 }
		int age = 10;
		
		//  10 >= 8 :참(true)
		//  10 <= 8 :거짓(false)
		if(age >= 8) {
			System.out.println("학교에 다닙니다.!!!");			
		}
				
		System.out.println("다음 구문 수행!!!");
		System.out.println("-------------");
		
		//2)if ~ else문 : 조건이 참일때 수행할 내용과 조건이 거짓일때 수행할 내용을 각각 지정해준다.
		//형식) if(조건식){조건이 참일때 수행할 내용} else {조건이 거짓일때 수행할 내용}
				
		int age1 = 10;
		
		//   10 >= 8 :참(true)
		if (age1 <= 8) {
			System.out.println("학교에 다닙니다.!!!");			
		} 
		else { //조건이 맞지 않을때 (age1 < 8)
			System.out.println("학교에 다니지 않습니다.!!!");	
		}
		
		System.out.println("다음 구문 수행!!!");
		System.out.println("-------------");
		
		//gender 변수의 값이 'F'와 같으면 "여성입니다", 아니면 "남성입니다" 출력
		char gender = 'F';
		
		if(gender == 'F') { 
			System.out.println("여성입니다.!!!");
		} else { 
			System.out.println("남성입니다.!!!");			
		}
		System.out.println("-------------");
		
		
		//score 변수의 값이 60점 이상이면 점수를 보여주고 "합격입니다!!",
		//아니면 점수를 보여주고 "불합격입니다.!!!" 출력
		int score = 90;
		
		if(score >= 60) { //조건이 참일때
			System.out.println("점수 : " + score + " -> 합격입니다.!!!");
		}
		else { //조건이 거짓일때
			System.out.println("점수 : " + score + " ->불합격입니다.!!!");
		}
		System.out.println("-------------");
		
		//score 변수의 값이 60점 이상이면 마일리지를 1000점 주고 "합격입니다!!",
		//아니면 마일리지를 100점 주고 "불합격입니다.!!!" 출력
		
		//int score1 = 50;
		System.out.println("점수를 입력하세요 >>> ");
		int score1 = sc.nextInt();
		int charge;
		
		//   50   >= 60  : 거짓
		if(score1 >= 60) {
			charge = 1000; //마일리지 : 1000점 
			System.out.println("점수 : " + score1 + " -> 합격입니다.!!!");
			//System.out.println("해당 마일리지 출력 : " + charge);
			
		} else {
			charge = 100; //마일리지 : 100점
			System.out.println("점수 : " + score1 + " ->불합격입니다.!!!");
			//System.out.println("해당 마일리지 출력 : " + charge);
		}
		
		System.out.println("해당 마일리지 출력 : " + charge);
		
		//2)if ~ else if ~ else문 : 조건이 여러개인 경우 맞는 조건을 수행하고 끝내는 구문이다.
		//형식)if(조건식){조건이 참일때 수행할 내용} else if(조건식) {조건이 참일때 수행할 내용} else { 물어보지 않은 모든 조건 수행 내용}
		
		

	}

}
